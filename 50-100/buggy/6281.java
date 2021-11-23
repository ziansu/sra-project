@java.lang.Override
public void close() throws java.sql.SQLException {
    if (!(this.isClosed())) {
        if ((this.currentResultSet) != null) {
            this.currentResultSet.close();
        }
        this.currentUpdateCount = -1;
        this.connection = null;
    }
}