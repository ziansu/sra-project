public void printRemainingFile(java.lang.String fileName) {
    try (java.io.PrintWriter p = new java.io.PrintWriter((fileName + ".new"))) {
        consumeRemainingFile(( s) -> p.println(s));
    } catch (java.io.IOException ex) {
        throw new java.lang.RuntimeException(("Unable to re-write file: " + fileName), ex);
    }
}