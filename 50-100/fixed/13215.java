@java.lang.Override
public java.lang.String apply(java.lang.String s) {
    s = s.trim();
    if (s.toUpperCase().startsWith("FROM")) {
        return "SELECT COUNT(1) " + s;
    }else {
        java.lang.String alias = (((getTableSymbol()) + "_alias_") + (com.zoowii.jpa_utils.util.StringUtil.randomString(5))).toUpperCase();
        return java.lang.String.format("SELECT COUNT(1) FROM (%s) %s", s, alias);
    }
}