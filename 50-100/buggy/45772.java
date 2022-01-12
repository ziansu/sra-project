public java.util.ArrayList getColumns() {
    java.util.ArrayList<java.lang.String> columns = new java.util.ArrayList<java.lang.String>();
    try {
        int cols = this.rsmd.getColumnCount();
        for (int i = 1; i < cols; i++) {
            columns.add(((java.lang.String) (rsmd.getColumnName(i))));
        }
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println(e.getMessage());
    }
    return columns;
}