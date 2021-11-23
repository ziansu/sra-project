@java.lang.Override
public <SUB_RETURN_T extends org.ow2.authzforce.core.pdp.api.value.AttributeValue> org.ow2.authzforce.core.pdp.api.func.Function<?> getFunction(final java.lang.String functionId, final org.ow2.authzforce.core.pdp.api.value.DatatypeFactory<SUB_RETURN_T> subFunctionReturnTypeFactory) {
    final org.ow2.authzforce.core.pdp.api.func.Function<?> nonGenericFunc = nonGenericFunctionRegistry.getExtension(functionId);
    if (nonGenericFunc != null) {
        return nonGenericFunc;
    }
    if ((genericHigherOrderFunctionFactoryRegistry) == null) {
        return null;
    }
    final org.ow2.authzforce.core.pdp.api.func.GenericHigherOrderFunctionFactory funcFactory = genericHigherOrderFunctionFactoryRegistry.getExtension(functionId);
    if (funcFactory == null) {
        return null;
    }
    return funcFactory.getInstance(subFunctionReturnTypeFactory);
}