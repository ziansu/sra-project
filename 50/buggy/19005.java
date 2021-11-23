protected java.lang.Number getAttrNumber(java.lang.String name, java.lang.String attrName) {
    org.eclipse.dawnsci.analysis.dataset.impl.Dataset d = getCachedAttribute(name, attrName);
    return d.hasFloatingPointElements() ? d.getElementDoubleAbs(0) : d.getElementLongAbs(0);
}