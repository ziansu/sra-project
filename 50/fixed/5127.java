@java.lang.Override
public java.lang.String exportHeader(be.nikiroo.gofetch.data.Story story) {
    return append(new java.lang.StringBuilder(), story, true).append("i\r\ni\r\n").toString();
}