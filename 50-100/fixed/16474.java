public static java.lang.String upperCamel(java.lang.String string, char seperator) {
    if (null == string) {
        return leap.lang.Strings.EMPTY;
    }
    java.lang.String[] parts = leap.lang.Strings.split(string, seperator);
    java.lang.StringBuilder out = new java.lang.StringBuilder();
    for (java.lang.String part : parts) {
        out.append(((part.substring(0, 1).toUpperCase()) + (part.substring(1))));
    }
    return out.toString();
}