public int getColumnIndex(java.lang.String columnName) throws uk.ac.exeter.QCRoutines.data.NoSuchColumnException {
    int result = -1;
    for (int i = 1; i < (data.size()); i++) {
        uk.ac.exeter.QCRoutines.data.DataColumn column = data.get(i);
        if (column.getName().equals(columnName)) {
            result = column.getColumnIndex();
            break;
        }
    }
    if (result == (-1)) {
        throw new uk.ac.exeter.QCRoutines.data.NoSuchColumnException(lineNumber, columnName);
    }
    return result;
}