@java.lang.Override
public boolean next() throws java.sql.SQLException {
    (position)++;
    if (hasNext()) {
        clearClobs();
        return true;
    }
    return false;
}