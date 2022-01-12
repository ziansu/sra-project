public java.util.ArrayList<java.lang.String[]> readTableWithColumnHeaders(KenTwo.Server.DB.Select s) {
    table = new java.util.ArrayList<>();
    java.lang.String[] headers = new java.lang.String[s.getColumnCount()];
    for (int i = 0; i < (s.getColumnCount()); i++) {
        headers[i] = s.getColumnName(i);
    }
    table.add(headers);
    table.addAll(read(s));
    return table;
}