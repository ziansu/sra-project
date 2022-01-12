public java.lang.reflect.Field getAccessibleDeclaredFiled() {
    try {
        java.lang.reflect.Field field = this.getContainer().getDeclaredField(((java.lang.String) (this.getName())));
        field.setAccessible(true);
        return field;
    } catch (java.lang.NoSuchFieldException e) {
        throw new java.lang.UnsupportedOperationException("Field not found during patch process");
    }
}