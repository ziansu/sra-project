private static java.lang.String capitalize(final java.lang.String name) {
    java.lang.String setterName = name;
    if ((name != null) && (((name.length()) == 1) || (((name.length()) > 1) && (!(java.lang.Character.isUpperCase(name.charAt(1))))))) {
        setterName = (name.substring(0, 1).toUpperCase()) + (name.substring(1));
    }
    return setterName;
}