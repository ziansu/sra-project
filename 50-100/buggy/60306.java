private void FillCombo() {
    try {
        MainSystem.DB_Connect.DB_ResultSet = MainSystem.AutoSQLQuery.db_con.executeQuery("SELECT * FROM garmentsystem.Machine_Table");
        while (DB_Connect.DB_ResultSet.next()) {
            java.lang.String id = DB_Connect.DB_ResultSet.getString("Machine_id");
            machineCombo.addItem(id);
        } 
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println(ex);
    }
}