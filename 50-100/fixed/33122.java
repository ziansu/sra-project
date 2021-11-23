private java.util.ArrayList<java.lang.String> getColNames(java.util.List<org.smap.model.IE> cols) {
    java.util.ArrayList<java.lang.String> colNames = new java.util.ArrayList<java.lang.String>();
    for (org.smap.model.IE col : cols) {
        colNames.add(col.getName());
    }
    return colNames;
}