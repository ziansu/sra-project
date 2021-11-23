public int returnID(java.lang.String n) throws java.sql.SQLException {
    try {
        conn.prepareStatement((("SELECT FROM COURSES WHERE NAME='" + n) + "'")).executeUpdate();
        java.sql.ResultSet executeQuery = conn.prepareStatement((("SELECT FROM COURSES WHERE NAME='" + n) + "'")).executeQuery();
        while (executeQuery.next()) {
            return executeQuery.getInt(1);
        } 
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    } finally {
        conn.close();
    }
    return -1;
}