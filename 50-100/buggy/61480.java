@org.jetbrains.annotations.NotNull
public java.lang.String readUnicode(final int size) throws java.io.IOException {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < (maxLength); i++) {
        char c = ((char) (readWord()));
        if (c == 0) {
            break;
        }
        sb.append(c);
    }
    return sb.toString();
}