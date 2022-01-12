@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (obj == null)
        return false;
    
    if ((getClass()) != (obj.getClass()))
        return false;
    
    org.projectfloodlight.openflow.types.IPv4Address other = ((org.projectfloodlight.openflow.types.IPv4Address) (obj));
    if (!(java.util.Arrays.equals(bytesCache, other.bytesCache)))
        return false;
    
    if ((rawValue) != (other.rawValue))
        return false;
    
    return true;
}