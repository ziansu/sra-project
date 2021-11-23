@java.lang.Override
public java.lang.Boolean validateField(java.lang.String field) {
    if (field.isEmpty())
        return false;
    
    return !(set.contains(field));
}