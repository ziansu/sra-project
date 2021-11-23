public int getConcurrency() throws java.sql.SQLException {
    checkOpen();
    return this.concurrency;
}