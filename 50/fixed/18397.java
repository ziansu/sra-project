public int compare(com.allogica.allogen.types.Type other) {
    if (other instanceof com.allogica.allogen.types.UserDefinedType) {
        return clazz.getFullyQualifiedName().compareTo(((com.allogica.allogen.types.UserDefinedType) (other)).clazz.getFullyQualifiedName());
    }
    return -1;
}