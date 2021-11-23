protected void errorLogger(java.lang.String lineNumber, java.lang.String expected, boolean exp) {
    if (showLineNumbers) {
        java.lang.System.out.println((((("Error: " + (exp ? "Expected: " : "")) + expected) + "  at line ") + lineNumber));
    }else {
        java.lang.System.out.println((("Error: " + (exp ? "Expected: " : "")) + expected));
    }
}