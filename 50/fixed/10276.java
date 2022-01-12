@java.lang.SuppressWarnings(value = "unchecked")
protected com.kepler.generic.reflect.convert.Getter getter(java.lang.Object source) {
    return java.util.Collection.class.isAssignableFrom(source.getClass()) ? new com.kepler.generic.reflect.convert.impl.ComplexConvertor.CollectionGetter(java.util.Collection.class.cast(source)) : new com.kepler.generic.reflect.convert.impl.ComplexConvertor.ArrayGetter(source);
}