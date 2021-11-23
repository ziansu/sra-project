public java.lang.String insertValuesIntoString(java.lang.String statement, java.lang.String[] values) {
    for (int i = 0; i < (values.length); i++) {
        statement = statement.replaceFirst("[?]", values[i]);
    }
    java.lang.System.out.println(statement);
    return statement;
}