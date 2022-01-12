public java.lang.String getClassName(java.lang.String name) {
    if ((name.length()) > 1) {
        name = (java.lang.Character.toUpperCase(name.charAt(0))) + (name.substring(1));
    }
    return name + "Dto";
}