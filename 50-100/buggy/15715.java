@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if (!(o instanceof com.kopylash.softengi.entity.Address))
        return false;
    
    com.kopylash.softengi.entity.Address address = ((com.kopylash.softengi.entity.Address) (o));
    if ((id) != (address.id))
        return false;
    
    if (!(city.equals(address.city)))
        return false;
    
    if (!(street.equals(address.street)))
        return false;
    
    return true;
}