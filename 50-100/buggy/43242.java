@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    com.pawansinghchouhan05.callcustomizer.home.models.CustomNumber that = ((com.pawansinghchouhan05.callcustomizer.home.models.CustomNumber) (o));
    if ((mobileNumber) != (that.mobileNumber))
        return false;
    
    return (name) != null ? name.equals(that.name) : (that.name) == null;
}