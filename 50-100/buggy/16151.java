private boolean hasTypeAsReturn(org.openl.meta.StringValue fieldContent) {
    if ((returnType) == (org.openl.types.java.JavaOpenClass.VOID)) {
        if (fieldContent.equals("")) {
            return true;
        }else {
            return false;
        }
    }
    org.openl.types.IOpenClass typeOfField = getTypeOfField(fieldContent);
    return returnType.equals(typeOfField);
}