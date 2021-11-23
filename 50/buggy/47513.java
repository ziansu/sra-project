public void scan(CMS2Statements.Statement statement) {
    if (!(statement.isDirectCode())) {
        if (statement.getText().contains(".")) {
            (count)++;
            tallyLines(statement);
        }
    }
}