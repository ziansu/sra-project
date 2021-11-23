private static java.util.List<java.lang.String> getLinesAlphabetically(java.lang.String s) {
    s = s.replace("\r", "");
    java.util.List<java.lang.String> lines = com.google.common.collect.Lists.newArrayList(s.split("\\n"));
    java.util.Collections.sort(lines);
    return lines;
}