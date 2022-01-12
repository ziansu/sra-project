@java.lang.Override
public void setReadOnly(boolean readOnly) throws java.sql.SQLException {
    ensureNotClosed();
    if (!readOnly)
        throw new java.sql.SQLFeatureNotSupportedException("Updates are not supported.");
    
}