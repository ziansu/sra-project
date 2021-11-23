private java.lang.String decapitalizeLikeLombok(java.lang.String name) {
    if ((name == null) || ((name.length()) == 0)) {
        return name;
    }
    char[] chars = name.toCharArray();
    chars[0] = java.lang.Character.toLowerCase(chars[0]);
    return new java.lang.String(chars);
}