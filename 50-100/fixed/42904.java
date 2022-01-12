public org.eclipse.titan.designer.AST.TTCN3.types.CompField getComponentByName(final org.eclipse.titan.designer.AST.Identifier identifier) {
    java.lang.String name = identifier.getName();
    name = (name.substring(0, 1).toLowerCase()) + (name.substring(1));
    if (null != (compFieldMap)) {
        return compFieldMap.getCompWithName(name);
    }
    return null;
}