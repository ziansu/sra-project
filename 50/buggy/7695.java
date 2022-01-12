public void addRow(java.lang.String row) {
    rows.add(row);
    if ((row.length()) > (numOfColumns)) {
        this.numOfColumns = length();
        (this.numOfRows)++;
    }
}