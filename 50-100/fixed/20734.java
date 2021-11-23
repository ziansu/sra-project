public java.lang.String getValue() {
    java.lang.StringBuffer out = new java.lang.StringBuffer();
    for (int i = 0; i < (values.length); i++) {
        if (i > 0) {
            out.append(", ");
        }
        out.append('\'');
        out.append(values[i]);
        out.append('\'');
    }
    return ("[" + (out.toString())) + "]";
}