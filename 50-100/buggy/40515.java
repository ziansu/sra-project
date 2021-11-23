@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    com.uom.cse.distsearch.Node node = ((com.uom.cse.distsearch.Node) (o));
    if ((port) != (node.port))
        return false;
    
    return ip.equals(node.ip);
}