public java.lang.String getSlice(int startLine, int endLine) {
    java.util.List<java.lang.String> lines = cl.getCodeSlice(startLine, endLine);
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (java.lang.String line : lines) {
        if ((sb.length()) != 0) {
            sb.append(PMD.EOL);
        }
        sb.append(line);
    }
    return sb.toString();
}