private static int getItemMeta(java.lang.String item) {
    java.lang.String one = (item.contains(";")) ? terrails.terracore.helper.StringHelper.getSubstringAfter(item, ";") : "0";
    java.lang.String two = (one.contains(",")) ? terrails.terracore.helper.StringHelper.getSubstringBefore(item, ",") : one;
    int meta = java.lang.Integer.parseInt(com.google.common.base.CharMatcher.digit().retainFrom(two));
    return meta;
}