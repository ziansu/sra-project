public java.lang.String raw() {
    java.lang.String out = "[ ";
    for (int i = 1; i < (data.length); i++) {
        out = (out + (data[i])) + " ";
    }
    return out + "]";
}