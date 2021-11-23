public java.lang.Object getValueOfProperty(java.lang.String propertyName, java.lang.Object object) {
    java.lang.String name = (this.caseSensitive) ? propertyName : propertyName.toLowerCase();
    java.lang.reflect.Field field = this.fields.get(name);
    try {
        return field.get(object);
    } catch (java.lang.IllegalAccessException e) {
        throw new org.sql2o.Sql2oException(((("could not read value of field " + (field.getName())) + " on class ") + (object.getClass().toString())), e);
    }
}