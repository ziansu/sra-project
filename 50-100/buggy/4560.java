@java.lang.Override
public java.lang.Object getPropertyAtIndex(java.lang.String s, int i) {
    try {
        java.lang.String attr = replaceAspectAttrSep(s);
        mc.dctm.el.identifier.context.IDfValue dfValue = sysObject.getRepeatingValue(attr, i);
        return extractValue(dfValue, sysObject.getAttrDataType(s));
    } catch (mc.dctm.el.identifier.context.DfException e) {
        throw new java.lang.RuntimeException(e);
    }
}