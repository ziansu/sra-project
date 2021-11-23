public void deleteItem(int id, java.util.ArrayList<java.lang.Integer> list) {
    updateDelete(id, list);
    try {
        java.sql.Statement myStmt = connection.createStatement();
        for (java.lang.String item : deletelist) {
            myStmt.execute(item);
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
        e.printStackTrace();
    }
}