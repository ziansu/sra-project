public java.lang.String getFullName() {
    if (((middleName) == null) || (middleName.isEmpty()))
        return ((firstName) + " ") + (lastName);
    
    return ((((firstName) + " ") + (middleName)) + " ") + (lastName);
}