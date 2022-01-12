@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((this.getClass()) != (o.getClass()))) {
        return false;
    }
    server.ConnectionToClient guest = ((server.ConnectionToClient) (o));
    return (this.name) == (guest.getName());
}