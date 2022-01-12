@java.lang.Override
public void removeEdition(org.magic.api.beans.MagicEdition me, org.magic.api.beans.MagicCollection col) throws java.sql.SQLException {
    org.magic.api.dao.impl.HsqlDAO.logger.info(((("remove " + me) + " from ") + col));
    java.sql.PreparedStatement pst = con.prepareStatement("delete from cards where edition=? and collection=?");
    pst.setString(1, me.getId());
    pst.setString(2, col.getName());
    pst.executeUpdate();
}