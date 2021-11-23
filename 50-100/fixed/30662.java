private static java.lang.String removeSuffix(final java.lang.String name, final java.lang.String suffix) {
    if ((name != null) && (name.toUpperCase().endsWith(("." + (suffix.toUpperCase()))))) {
        return name.substring(0, ((name.length()) - 3));
    }
    return name;
}