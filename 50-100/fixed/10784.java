static org.opendaylight.yangtools.yang.data.api.YangInstanceIdentifier getRootInstanceIdentifier(final java.lang.Class type) {
    try {
        return org.opendaylight.yangtools.yang.data.api.YangInstanceIdentifier.of(org.opendaylight.yangtools.yang.common.QName.class.cast(type.getField("QNAME").get(null)));
    } catch (java.lang.IllegalAccessException e) {
        throw new java.lang.IllegalStateException(("Constant QNAME not accessible for type" + type), e);
    } catch (java.lang.NoSuchFieldException e) {
        throw new java.lang.IllegalStateException((("Class " + type) + " does not have QName defined"), e);
    }
}