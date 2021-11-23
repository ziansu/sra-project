public java.lang.String toString() {
    java.lang.StringBuilder b = new java.lang.StringBuilder();
    b.append("\"");
    for (int i = 0; i < (props.text.length); i++) {
        b.append(props.text[i]);
        if ((i + 1) < (props.text.length)) {
            b.append('\n');
        }
    }
    b.append('\"');
    return b.toString();
}