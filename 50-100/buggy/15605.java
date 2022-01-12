private java.util.List<com.google.api.codegen.viewmodel.ApiMethodView> generateApiMethods(com.google.api.codegen.transformer.GapicInterfaceContext context, boolean packageHasMultipleServices) {
    com.google.common.collect.ImmutableList.Builder<com.google.api.codegen.viewmodel.ApiMethodView> apiMethods = com.google.common.collect.ImmutableList.builder();
    for (com.google.api.codegen.config.MethodModel method : context.getSupportedMethods()) {
        apiMethods.add(apiMethodTransformer.generateMethod(context.asDynamicMethodContext(method)));
    }
    return apiMethods.build();
}