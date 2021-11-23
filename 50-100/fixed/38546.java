@java.lang.Override
public void setPropertyAtIndex(java.lang.String s, java.lang.Object o, int i) {
    try {
        java.lang.String attr = replaceAspectAttrSep(s);
        int attrDataType = sysObject.getAttrDataType(attr);
        sysObject.setRepeatingValue(attr, i, toDfValue(o, attrDataType));
    } catch (mc.dctm.el.identifier.context.DfException e) {
        throw new java.lang.RuntimeException(e);
    }
}