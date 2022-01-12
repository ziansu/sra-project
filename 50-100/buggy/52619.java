public void setKeyInformation(java.lang.String name, int popularity, int salesalbum, int salesconcert) {
    try {
        java.sql.Statement stm = ConnectionManager.conn.createStatement();
        java.sql.ResultSet rs;
        java.lang.String str = java.lang.String.format("UPDATE band SET name = '%s', popularity = %d, salesalbum = %d, salesconcerts = %d WHERE idBand = %d", name, popularity, salesalbum, salesconcert, bandId);
        java.lang.System.out.println(str);
        stm.executeUpdate(str);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
    }
}