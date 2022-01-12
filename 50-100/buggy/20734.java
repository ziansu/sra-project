public java.lang.String getValue() {
    java.lang.String out = "";
    for (int i = 0; i < (values.length); i++) {
        if (i > 0) {
            out += ", ";
        }
        out += ('\'' + (values[i])) + "\'";
    }
    return ("[" + out) + "]";
}