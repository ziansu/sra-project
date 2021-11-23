@java.lang.Override
public void setProperty(java.lang.String s, java.lang.Object o) {
    try {
        java.lang.String attr = replaceAspectAttrSep(s);
        int attrDataType = sysObject.getAttrDataType(attr);
        sysObject.setValue(attr, toDfValue(o, attrDataType));
    } catch (mc.dctm.el.identifier.context.DfException e) {
        throw new java.lang.RuntimeException(e);
    }
}