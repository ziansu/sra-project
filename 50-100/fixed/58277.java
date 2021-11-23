public java.lang.reflect.Field getAccessibleDeclaredFiled(java.lang.String fieldName) {
    try {
        java.lang.reflect.Field field = this.getContainer().getDeclaredField(fieldName);
        field.setAccessible(true);
        return field;
    } catch (java.lang.NoSuchFieldException e) {
        throw new java.lang.UnsupportedOperationException("Field not found during patch process");
    }
}