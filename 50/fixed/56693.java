@java.lang.Override
protected spiralcraft.lang.Focus<?> bindExports(spiralcraft.lang.Focus<?> chain) throws spiralcraft.common.ContextualException {
    chain = super.bindExports(chain);
    if ((resourceMappingX) != null) {
        resourceMappingX.bind(chain);
    }
    return chain;
}