private net.sf.mmm.code.impl.java.type.JavaType getType(net.sf.mmm.code.impl.java.JavaRootContext.JavaTypeContainer typeContainer) {
    if ((typeContainer.javaType) == null) {
        typeContainer.javaType = ((net.sf.mmm.code.impl.java.type.JavaType) (super.getType(typeContainer.javaClass)));
    }
    return typeContainer.javaType;
}