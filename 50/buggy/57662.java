public void scan(CMS2Statements.Statement statement) {
    if (!(statement.isDirectCode())) {
        if (getFirstToken(statement.getText()).equals("COMMENT")) {
            (count)++;
            tallyLines(statement);
        }
    }
}