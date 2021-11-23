public void setColumnType(java.lang.String columnType) {
    if (columnType != null) {
        if (columnType.toLowerCase().equals("string")) {
            this.columnType = "varchar(150)";
        }else
            if (columnType.toLowerCase().equals("integer")) {
                this.columnType = "INT";
            }else {
                this.columnType = columnType;
            }
        
    }
}