public com.ait.lienzo.client.core.types.PathPartList A(final double x0, final double y0, double x1, final double y1, final double radius) {
    push(com.ait.lienzo.client.core.types.PathPartEntryJSO.make(PathPartEntryJSO.CANVAS_ARCTO_ABSOLUTE, com.ait.tooling.nativetools.client.collection.NFastDoubleArrayJSO.make(x0, y0, (m_cpx = x1), (m_cpy = y1), radius)));
    return this;
}