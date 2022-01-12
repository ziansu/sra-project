@java.lang.Override
public java.lang.Object convert(java.lang.Object source, java.lang.Class<?> targetClass, io.beanmapper.core.BeanFieldMatch beanFieldMatch) {
    if (((source == null) || (source.getClass().equals(targetClass))) || ((beanFieldMatch != null) && (beanFieldMatch.getSourceClass().equals(targetClass)))) {
        return source;
    }
    java.lang.Object sourceAsString = beanMapper.convert(source, java.lang.String.class, beanFieldMatch);
    return beanMapper.convert(sourceAsString, targetClass, beanFieldMatch);
}