@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof org.apache.cassandra.db.lifecycle.LogRecord))
        return false;
    
    final org.apache.cassandra.db.lifecycle.LogRecord other = ((org.apache.cassandra.db.lifecycle.LogRecord) (obj));
    return ((type) == (other.type)) && (relativeFilePath.equals(other.relativeFilePath));
}