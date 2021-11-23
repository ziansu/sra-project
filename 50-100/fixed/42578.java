private java.util.ArrayList<java.lang.Integer> columnIndicesForDropDowns(java.lang.String[] headerColumns) {
    java.util.ArrayList<java.lang.Integer> columnIndicesForDropDowns = new java.util.ArrayList<java.lang.Integer>();
    java.lang.String[] dropDownNames = value.split(",");
    for (java.lang.String dropDownName : dropDownNames) {
        for (int i = 0; i < (headerColumns.length); ++i) {
            if (headerColumns[i].equals(dropDownName)) {
                columnIndicesForDropDowns.add(i);
            }
        }
    }
    return columnIndicesForDropDowns;
}