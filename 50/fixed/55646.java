public java.lang.String getArrayTypeString() {
    java.lang.String typeStr = "";
    if ((arrayType) != null) {
        typeStr = arrayType.getGenericComponentType().toString();
    }
    return typeStr;
}