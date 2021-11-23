@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (!(o instanceof simpledb.RecordId))
        return false;
    
    simpledb.RecordId rid = ((simpledb.RecordId) (o));
    return (pid.equals(rid.getPageId())) && ((rid.tupleno) == (tupleno));
}