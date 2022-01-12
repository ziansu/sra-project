@java.lang.Override
public boolean equals(final java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (obj == null)
        return false;
    
    if ((getClass()) != (obj.getClass()))
        return false;
    
    org.sqlproc.sample.simple.model.BillingDetails other = ((org.sqlproc.sample.simple.model.BillingDetails) (obj));
    if (((id) == null) || (!(id.equals(other.id))))
        return false;
    
    return true;
}