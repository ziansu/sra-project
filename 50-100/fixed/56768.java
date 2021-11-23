@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (obj == null)
        return false;
    
    if ((getClass()) != (obj.getClass()))
        return false;
    
    com.demo.Product other = ((com.demo.Product) (obj));
    if (!(id.equals(other.id)))
        return false;
    
    return true;
}