public boolean findTagInDatabase(long upcTag, long serialTag, java.sql.Connection c) throws java.lang.Exception {
    java.sql.Statement stmt = c.createStatement();
    java.lang.String sql = ((("SELECT * FROM products JOIN upc_descriptions ON upc_descriptions.id = products.upc_description_id WHERE upc = " + upcTag) + " AND serial_num = ") + serialTag) + ";";
    java.sql.ResultSet rs = stmt.executeQuery(sql);
    if (!(rs.next())) {
        stmt.close();
        java.lang.System.out.println("Did not find Tag");
        return false;
    }
    stmt.close();
    java.lang.System.out.println("Found Tag");
    return true;
}