@java.lang.Override
public void free() throws java.sql.SQLException {
    if ((blob) != null) {
        blob.close();
    }
}