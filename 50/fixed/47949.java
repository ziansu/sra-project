@java.lang.Override
public java.lang.Boolean validateField(java.lang.String field) {
    return (!(field.isEmpty())) && (!(set.contains(field)));
}