public boolean absolute(int row) throws java.sql.SQLException {
    if ((((rowData.size()) > 0) && (row <= (rowData.size()))) && (row >= 0)) {
        rowPosition = row - 1;
        setCurrentRow(rowPosition);
        return true;
    }
    return false;
}