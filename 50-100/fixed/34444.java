public java.lang.String getFullName() {
    if ((middleName.equals(null)) || (middleName.isEmpty()))
        return ((firstName) + " ") + (lastName);
    
    return ((((firstName) + " ") + (middleName)) + " ") + (lastName);
}