@java.lang.Override
public java.lang.String columnToFieldName(java.lang.String columnName) {
    if ((columnName.indexOf('_')) >= 0) {
        return leap.lang.Strings.lowerCamel(columnName, '_');
    }else {
        return columnName;
    }
}