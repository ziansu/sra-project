protected java.lang.Object valueForProperty(java.beans.PropertyDescriptor descriptor, java.lang.Object item) {
    try {
        java.lang.Object value = descriptor.getReadMethod().invoke(item);
        if (value instanceof java.util.Optional) {
            java.util.Optional optional = ((java.util.Optional) (value));
            value = optional.orElse(null);
        }
        return value;
    } catch (java.lang.IllegalAccessException e) {
        throw new java.lang.RuntimeException(e);
    } catch (java.lang.reflect.InvocationTargetException e) {
        throw new java.lang.RuntimeException(e);
    }
}