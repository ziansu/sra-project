public static java.lang.String addComma(java.lang.Object value) {
    if (value == null)
        return com.hangum.tadpole.commons.libs.core.define.PublicTadpoleDefine.DEFINE_NULL_VALUE;
    
    try {
        java.text.NumberFormat nf = java.text.NumberFormat.getNumberInstance();
        return nf.format(java.lang.Double.parseDouble(value.toString()));
    } catch (java.lang.Exception e) {
    }
    return value.toString();
}