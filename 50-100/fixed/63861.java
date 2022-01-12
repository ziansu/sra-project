@com.fasterxml.jackson.annotation.JsonIgnore
private final java.util.List<java.lang.reflect.Field> getRequiredFields() {
    java.lang.reflect.Field[] fs = this.getClass().getFields();
    java.util.List<java.lang.reflect.Field> requiredFields = new java.util.LinkedList<>();
    for (java.lang.reflect.Field f : fs) {
        java.lang.annotation.Annotation a = f.getAnnotation(edu.washington.escience.myria.api.encoding.Required.class);
        if (a != null) {
            requiredFields.add(f);
        }
    }
    return requiredFields;
}