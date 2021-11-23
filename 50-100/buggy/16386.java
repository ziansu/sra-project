public boolean absolute(int row) throws java.sql.SQLException {
    if (((rowData.size()) > 0) && (row <= (rowData.size()))) {
        rowPosition = row;
        setCurrentRow(rowPosition);
        return true;
    }
    if ((row == (-1)) && ((rowData.size()) > 0)) {
        rowPosition = (rowData.size()) - 1;
        setCurrentRow(rowPosition);
        return true;
    }
    return false;
}