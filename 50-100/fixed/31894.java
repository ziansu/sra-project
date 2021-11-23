public static void writeToDB(java.util.List<?> data) throws java.lang.Exception {
    java.lang.Class cls = data.get(0).getClass();
    java.lang.String sql = com.chenxin.autobuildmodel.GenerateTable.getInsertSQL(cls);
    java.lang.System.out.println(sql);
    com.chenxin.autobuildmodel.JDBCTool.getInstance().batchSaveToDB(sql, data);
}