@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (obj == null)
        return false;
    
    if ((getClass()) != (obj.getClass()))
        return false;
    
    com.ingesup.labojava.bean.User other = ((com.ingesup.labojava.bean.User) (obj));
    if (((id) == (other.id)) && ((email) == (other.email)))
        return true;
    else
        return false;
    
}