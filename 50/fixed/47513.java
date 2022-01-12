public void scan(CMS2Statements.Statement statement) {
    if ((statement.isDirectCode()) && (statement.getText().contains("."))) {
        (count)++;
    }
}