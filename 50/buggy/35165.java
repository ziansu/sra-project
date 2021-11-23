static org.osgl.inject.BeanSpec of(java.lang.String name, java.lang.reflect.Type type, java.lang.annotation.Annotation[] paramAnnotations, org.osgl.inject.Genie genie) {
    org.osgl.inject.BeanSpec spec = org.osgl.inject.BeanSpec.of(type, paramAnnotations, genie);
    spec.name = name;
    return spec;
}