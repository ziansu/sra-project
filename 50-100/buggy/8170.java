@java.lang.Override
public void removeCard(org.magic.api.beans.MagicCard mc, org.magic.api.beans.MagicCollection collection) throws java.sql.SQLException {
    org.magic.api.dao.impl.HsqlDAO.logger.debug(((("remove " + mc) + " from ") + collection));
    java.sql.PreparedStatement pst = con.prepareStatement("delete from cards where name=? and edition=? and collection=?");
    pst.setString(1, mc.getName());
    pst.setString(2, mc.getEditions().get(0).getId());
    pst.setString(3, collection.getName());
    pst.executeUpdate();
}