public java.util.List<java.lang.String> getCodeSlice(int startLine, int endLine) {
    java.util.List<java.lang.String> c = null;
    if ((code) != null) {
        c = code.get();
    }
    if (c != null) {
        return c.subList(startLine, endLine);
    }
    return load(startLine, endLine);
}