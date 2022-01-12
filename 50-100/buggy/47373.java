private java.util.List<java.lang.String> getConsumesList(com.apporiented.rest.apidoc.factory.impl.RequestMapping classMapping, com.apporiented.rest.apidoc.factory.impl.RequestMapping methodMapping) {
    java.util.List<java.lang.String> consumes;
    if ((methodMapping.produces().length) > 0) {
        consumes = java.util.Arrays.asList(methodMapping.consumes());
    }else {
        consumes = java.util.Arrays.asList(classMapping.consumes());
    }
    return (consumes.size()) > 0 ? consumes : null;
}