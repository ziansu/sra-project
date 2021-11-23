public void SQLUpdate(Blood.db.pojos.Hospital hospUpdate) throws java.io.IOException, java.sql.SQLException {
    java.lang.String sql = "UPDATE Hospital SET name=? ,location=? ,range=?  WHERE id=?";
    java.sql.PreparedStatement prep = super.c.prepareStatement(sql);
    prep.setString(1, hospUpdate.getName());
    prep.setString(2, hospUpdate.getLocation());
    prep.setInt(3, hospUpdate.getRange());
    prep.setInt(4, hospUpdate.getId());
    java.lang.System.out.println("Update is finished");
    prep.executeUpdate();
    prep.close();
}