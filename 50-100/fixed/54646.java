@java.lang.Override
protected java.lang.Class<? extends org.eclipse.wst.xml.xpath2.processor.internal.types.AnyType> substitute(java.lang.Class<? extends org.eclipse.wst.xml.xpath2.processor.internal.types.AnyType> typeToConsider) {
    if ((typeToConsider == (org.eclipse.wst.xml.xpath2.processor.internal.types.XSAnyURI.class)) || (typeToConsider == (org.eclipse.wst.xml.xpath2.processor.internal.types.XSString.class))) {
        return typeToConsider;
    }
    if (((typeToConsider == (org.eclipse.wst.xml.xpath2.processor.internal.types.XSDateTime.class)) || (typeToConsider == (org.eclipse.wst.xml.xpath2.processor.internal.types.XSDate.class))) || (typeToConsider == (org.eclipse.wst.xml.xpath2.processor.internal.types.XSTime.class))) {
        return typeToConsider;
    }
    return super.substitute(typeToConsider);
}