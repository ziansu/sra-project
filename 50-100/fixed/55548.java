private boolean isObjectAttributeEquals(java.lang.Object o, java.lang.String attribute, java.lang.Object value) throws org.openflexo.model.factory.ModelDefinitionException {
    org.openflexo.model.factory.ProxyMethodHandler<?> handler = getModelFactory().getHandler(o);
    if (handler != null) {
        java.lang.Object attributeValue = handler.invokeGetter(attribute);
        return org.openflexo.model.factory.ProxyMethodHandler.isEqual(attributeValue, value);
    }else {
        throw new org.openflexo.model.factory.ModelDefinitionException(((("Found object of type " + (o.getClass().getName())) + " but is not an instanceof ProxyObject:\n") + o));
    }
}