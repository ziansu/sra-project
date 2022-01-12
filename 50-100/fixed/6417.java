private miniDB.storage.CreateTableData createTable() {
    tableData = new miniDB.storage.CreateTableData();
    if (str[1].matches("[a-zA-Z]\\w*")) {
        tableData.setTableName(str[1]);
    }else {
        return null;
    }
    if (!(str[2].equals("(")))
        return null;
    
    if (isAttr(3)) {
        return tableData;
    }
    return null;
}