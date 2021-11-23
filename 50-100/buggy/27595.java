private void printUnderLine(int startIndex, int length) {
    for (int i = 0; i < startIndex; ++i) {
        java.lang.System.err.print(" ");
    }
    java.lang.System.err.print("^");
    for (int i = 0; i < (length - 1); ++i) {
        java.lang.System.err.print("~");
    }
    java.lang.System.err.println("");
}