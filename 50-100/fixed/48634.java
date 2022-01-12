private void setAttribute(java.lang.reflect.Field field, java.lang.Object o, java.lang.Object value) {
    if (field != null) {
        try {
            field.setAccessible(true);
            field.set(o, value);
        } catch (java.lang.Exception e) {
            com.arangodb.impl.AnnotationHandler.logger.error(("could not update document attribute of class " + (value.getClass().getCanonicalName())), e);
        }
    }
}