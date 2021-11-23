private static java.io.PrintStream duplicatePrintStream(java.io.PrintStream realPrintStream, java.io.PrintStream newOutputStream) {
    return new java.io.PrintStream(realPrintStream) {
        @java.lang.Override
        public void print(final java.lang.String str) {
            realPrintStream.print(str);
            newOutputStream.println(str);
        }
    };
}