public java.lang.String[] getValues() {
    int columnNumber = tblContent.getColumnCount();
    java.lang.System.out.println(columnNumber);
    java.lang.String[] result = new java.lang.String[columnNumber];
    for (int i = 0; i < columnNumber; i++) {
        result[i] = ((java.lang.String) (tblContent.getModel().getValueAt(0, i)));
    }
    return result;
}