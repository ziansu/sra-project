public static java.lang.String singularToPlural(java.lang.String singul) {
    return org.apache.commons.lang3.StringUtils.isBlank(singul) ? singul : singul.endsWith("s") ? singul + "es" : singul.endsWith("y") ? (org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(singul, "y")) + "ies" : singul + "s";
}