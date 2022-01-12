public java.util.HashMap<java.lang.String, java.lang.Object> fetchRow(java.lang.String sql) {
    java.util.List<java.util.HashMap> table = this.fetchTable(sql);
    return (table.size()) >= 1 ? table.get(0) : new java.util.HashMap<java.lang.String, java.lang.Object>();
}