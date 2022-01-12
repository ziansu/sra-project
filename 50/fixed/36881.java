protected org.eclipse.xtext.common.types.access.IMirror createMirror(org.eclipse.jdt.core.IType type) {
    java.lang.String elementName = type.getElementName();
    if (!(elementName.equals(type.getTypeQualifiedName()))) {
        return null;
    }
    return new org.eclipse.xtext.common.types.access.jdt.JdtTypeMirror(type, typeFactory, services);
}