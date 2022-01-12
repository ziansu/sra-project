public com.socrata.builders.DatasetBuilder updateColumn(java.lang.String columnName, com.socrata.builders.Column columnToUpdateTo) {
    if ((columns) != null) {
        int i = 0;
        for (com.socrata.builders.Column column : columns) {
            if (columnName.equals(column.getName())) {
                columns.set(i, columnToUpdateTo);
                break;
            }
            i++;
        }
    }
    return this;
}