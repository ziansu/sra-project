@java.lang.Override
public boolean next() throws java.sql.SQLException {
    if (hasNext()) {
        (position)++;
        clearClobs();
        return true;
    }
    return false;
}