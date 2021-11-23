@java.lang.Override
public java.lang.String toParamName(java.lang.String name) {
    name = sanitizeName(name);
    name = name.replaceAll("-", "_");
    if (name.matches("^[A-Z_]*$")) {
        return name;
    }
    name = camelize(name, true);
    if ((isReservedWord(name)) || (name.matches("^\\d.*"))) {
        name = escapeReservedWord(name);
    }
    return name;
}