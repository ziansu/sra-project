public int[] getModuleIds() {
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