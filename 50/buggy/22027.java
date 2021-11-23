public static void main(java.lang.String[] args) {
    try {
        new core.Handler().testChangeStdOut();
    } catch (java.nio.file.InvalidPathException | java.io.FileNotFoundException e) {
        java.lang.System.out.println("LEARN HOW TO PROPERLY HANDLE ERRORS ALREADY");
        java.lang.System.out.println("Errors should not propagate to this level. Handler level at the most!");
    }
}