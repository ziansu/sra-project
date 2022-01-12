org.osgl.inject.BeanSpec beanSpec(org.osgl.inject.Genie genie) {
    org.osgl.inject.BeanSpec spec = org.osgl.inject.BeanSpec.of(name, type, annotations.toArray(new java.lang.annotation.Annotation[annotations.size()]), genie);
    if ((scope) != null) {
        spec.scope(scope);
    }
    return spec;
}