public void println(java.lang.String s) {
    try {
        out.append(s).append('\n');
        out.flush();
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}