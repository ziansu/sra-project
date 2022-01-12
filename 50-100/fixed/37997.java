@javax.enterprise.inject.Produces
@javax.enterprise.inject.Default
@config.ConfigMapping
public <T> config.Config<T> produce(javax.enterprise.inject.spi.InjectionPoint ip) {
    java.lang.reflect.ParameterizedType type = ((java.lang.reflect.ParameterizedType) (ip.getType()));
    java.lang.Class targetType = ((java.lang.Class) (type.getActualTypeArguments()[0]));
    java.lang.String prefix = getAnnotationKey(ip.getMember(), targetType);
    return new config.Config(createInstance(targetType, prefix));
}