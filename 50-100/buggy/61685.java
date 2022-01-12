public java.lang.String[] getColumnNames() {
    java.lang.String[] ret = new java.lang.String[columnNames.size()];
    int index = 0;
    for (java.lang.String s : columnNames.values()) {
        if (!(s.equals("ID"))) {
            java.lang.System.out.println(s);
            ret[index] = s;
            index++;
        }
    }
    return ret;
}