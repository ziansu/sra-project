private void writeNewCardInUse(java.lang.String id) {
    try {
        java.lang.String sql = (((("INSERT INTO CardInUse (id,EnterTime) " + "VALUES ('") + id) + "', '") + (new java.util.Date())) + "');";
        java.lang.System.out.println(sql);
        statmt.executeUpdate(sql);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}