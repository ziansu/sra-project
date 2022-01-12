public int callQuery(java.lang.String sql) {
    int x = 0;
    try {
        dbmc = com.bsc.collect.remotedbaccess.DataBaseManagement.getInstance();
        con = ((com.mysql.jdbc.Connection) (dbmc.setConnetctionRemote()));
        state = con.createStatement();
        x = state.executeUpdate(sql);
        java.lang.System.out.println(sql);
    } catch (java.sql.SQLException ex) {
        java.util.logging.Logger.getLogger(com.bsc.collect.remotedbaccess.ProsedeurControlsRemote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    return x;
}