public void examineRecord(java.lang.String path, java.lang.String db, java.lang.String table, int record) {
    BusinessLogic.SpiderToDB std = new BusinessLogic.SpiderToDB();
    BusinessLogic.DBConnect toDB = new BusinessLogic.DBConnect(db);
    java.lang.System.out.println(std.readRecord(path, record));
    BusinessLogic.DBFood foodItem = std.formatRecord(std.readRecord(path, record));
    if (foodItem != null) {
        toDB.pushFoodN(foodItem, table);
    }
}