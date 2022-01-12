@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    uk.co.baconi.secure.user.User user = ((uk.co.baconi.secure.user.User) (o));
    return (java.util.Objects.equals(name, user.name)) && (java.util.Objects.equals(shared, user.shared));
}