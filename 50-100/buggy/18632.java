@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    se.acreo.doubledecker.DDMsg ddMsg = ((se.acreo.doubledecker.DDMsg) (o));
    if (!(data.equals(ddMsg.data)))
        return false;
    
    return address.equals(ddMsg.address);
}