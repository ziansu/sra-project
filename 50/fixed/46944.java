private boolean haveNext() throws java.io.IOException, java.sql.SQLException {
    boolean haveNext = resultSet.next();
    if (haveNext) {
        (result.totalCount)++;
        currentRecord = getConverter(resultSet).convertToAvro(resultSet);
    }
    return haveNext;
}