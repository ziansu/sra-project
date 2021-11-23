public static boolean isPrefix(java.lang.String name) {
    return (((((name == null) || (name.isEmpty())) || ((name.charAt(0)) == '_')) || (java.lang.Character.isLetter(name.charAt(0)))) || ((name.charAt(0)) == '?')) || ((name.charAt(0)) == '\\');
}