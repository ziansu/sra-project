@java.lang.Override
public void update(java.lang.String query) {
    java.sql.PreparedStatement ps;
    try {
        ps = getConnection().prepareStatement(query);
        ps.executeUpdate();
    } catch (java.sql.SQLException ex) {
        com.github.acquized.retile.ProjectRetile.getInstance().getLog().error("Could not execute SQL update!", ex);
    }
}