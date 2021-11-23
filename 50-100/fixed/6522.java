@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if (!(o instanceof status.IpCounter))
        return false;
    
    status.IpCounter ipCounter = ((status.IpCounter) (o));
    return (quantity.equals(ipCounter.quantity)) && (date.equals(ipCounter.date));
}