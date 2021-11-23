@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    sagex.miniclient.ServerInfo that = ((sagex.miniclient.ServerInfo) (o));
    if ((port) != (that.port))
        return false;
    
    return address.equals(that.address);
}