@java.lang.Override
public java.lang.String createName(java.lang.String fieldName, java.lang.String name) {
    return (removeWildcard(fieldName)) + name;
}