@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (obj == null)
        return false;
    
    if ((getClass()) != (obj.getClass()))
        return false;
    
    org.araqne.logdb.query.command.Join.JoinKeys other = ((org.araqne.logdb.query.command.Join.JoinKeys) (obj));
    return org.araqne.logdb.query.command.Join.JoinKeys.equals(keys, other.keys);
}