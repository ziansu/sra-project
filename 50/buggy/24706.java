public static java.lang.String revertToOriginalkey(java.lang.String fixedString) {
    if (org.apache.commons.lang3.StringUtils.contains(fixedString, org.calrissian.accumulorecipes.commons.iterators.support.NodeToJexl.JEXL_NORM_PREFIX))
        return org.apache.commons.lang.StringUtils.replaceEach(fixedString, org.calrissian.accumulorecipes.commons.iterators.support.NodeToJexl.strings, org.calrissian.accumulorecipes.commons.iterators.support.NodeToJexl.chars);
    
    return fixedString;
}