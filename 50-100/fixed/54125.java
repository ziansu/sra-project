private com.google.common.base.Predicate<springfox.documentation.RequestHandler> apis(com.k4hub.swagger2.Swagger2Properties swagger2Properties) {
    java.util.List<com.google.common.base.Predicate<springfox.documentation.RequestHandler>> basePackages = new java.util.LinkedList<>();
    if (swagger2Properties.getBasePackage().isEmpty()) {
        basePackages.add(springfox.documentation.builders.RequestHandlerSelectors.any());
    }
    for (java.lang.String basePackage : swagger2Properties.getBasePackage()) {
        basePackages.add(springfox.documentation.builders.RequestHandlerSelectors.basePackage(basePackage));
    }
    return com.google.common.base.Predicates.or(basePackages);
}