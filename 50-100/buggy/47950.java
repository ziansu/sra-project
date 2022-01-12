public void show() throws java.sql.SQLException {
    try {
        java.sql.ResultSet executeQuery = conn.prepareStatement("SELECT * FROM Faculty").executeQuery();
        while (executeQuery.next()) {
            java.lang.System.out.println((((executeQuery.getInt(1)) + " | ") + (executeQuery.getString(2))));
        } 
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    } finally {
        conn.close();
    }
}