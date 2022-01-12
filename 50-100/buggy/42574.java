public static boolean isCNNumericString(java.lang.String str, int sIdx, int eIdx) {
    for (int i = sIdx; i < eIdx; i++) {
        if (!(org.lionsoul.jcseg.util.NumericUtil.cnNumeric.containsKey(str.charAt(0)))) {
            return false;
        }
    }
    return true;
}