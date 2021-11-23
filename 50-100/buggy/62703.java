private java.lang.String printContents(com.vzome.core.zomic.program.ZomicStatement program) {
    java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
    try {
        try (java.io.PrintWriter out = new java.io.PrintWriter(output)) {
            program.accept(new com.vzome.core.zomic.program.PrintVisitor(out, symmetry));
        }
    } catch (com.vzome.core.zomic.ZomicException ex) {
        ex.printStackTrace();
        throw new java.lang.RuntimeException(ex);
    }
    return new java.lang.String(output.toByteArray());
}