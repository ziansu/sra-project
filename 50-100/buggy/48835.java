@org.romaframework.aspect.view.annotation.ViewField(visible = org.romaframework.aspect.core.annotation.AnnotationConstants.FALSE)
public java.lang.Object getFinalValue() throws java.lang.Exception, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
    if (((value) != null) && ((value.trim()) != "")) {
        if ((formatter) == null) {
            return typeClass.getConstructor(new java.lang.Class[]{ java.lang.String.class }).newInstance(new java.lang.Object[]{ value });
        }else {
            return formatter.parseObject(value);
        }
    }else {
        return null;
    }
}