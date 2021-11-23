private void parseResTable() {
    this.table = new com.chris.pkg.manager.bean.android.resource.bean.ResChunkTable();
    parseResTableHeader();
    parseResPkg();
}