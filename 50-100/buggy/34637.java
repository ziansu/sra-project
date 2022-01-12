public java.sql.ResultSet getResult(java.lang.String query) {
    try {
        java.lang.Class.forName(driver);
        con = java.sql.DriverManager.getConnection(url, user, pswd);
        pps = con.prepareStatement(query);
        rls = pps.executeQuery();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return rls;
}