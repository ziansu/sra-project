private void run() throws java.lang.Exception {
    this.deleteTable(com.mapr.db.samples.basic.Ex01SimpleCRUD.TABLE_PATH);
    this.table = this.getTable(com.mapr.db.samples.basic.Ex01SimpleCRUD.TABLE_PATH);
    this.printTableInformation(com.mapr.db.samples.basic.Ex01SimpleCRUD.TABLE_PATH);
    java.lang.System.out.println("\n\n========== INSERT NEW RECORDS ==========");
    this.createDocuments();
    java.lang.System.out.println("\n\n========== QUERIES ==========");
    this.queryDocuments();
    java.lang.System.out.println("\n\n========== UPDATE ==========");
    this.updateDocuments();
    this.table.close();
}