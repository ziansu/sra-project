public void close() throws java.sql.SQLException {
    available();
    this.datasource.close();
    this.datasource = null;
}