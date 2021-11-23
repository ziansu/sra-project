public java.lang.String getFullName() {
    if (((businessName) != null) || (!(businessName.trim().isEmpty()))) {
        return businessName;
    }else
        return ((firstName) + " ") + (lastName);
    
}