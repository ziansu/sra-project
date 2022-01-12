private java.lang.Class<PO> getModelTypeClass() {
    java.lang.reflect.ParameterizedType parameterizedType = ((java.lang.reflect.ParameterizedType) (getClass().getGenericSuperclass()));
    @java.lang.SuppressWarnings(value = "unchecked")
    java.lang.Class<PO> ret = ((java.lang.Class<PO>) (parameterizedType.getActualTypeArguments()[0]));
    return ret;
}