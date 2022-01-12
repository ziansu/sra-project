public int[] getModuleIds() {
    java.util.List<java.lang.Integer> moduleids = new java.util.ArrayList<java.lang.Integer>();
    rst = db.executeQuery("SELECT * FROM courses");
    try {
        while (rst.next()) {
            moduleids.add(rst.getInt("id"));
        } 
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        message += e.getMessage();
    } finally {
        db.closeConnection();
    }
    return convertIntegerListToIntegerArray(moduleids);
}