protected org.eclipse.jdt.internal.compiler.batch.Main getMain() {
    return new org.eclipse.jdt.internal.compiler.batch.Main(new java.io.PrintWriter(new java.io.OutputStreamWriter(java.lang.System.out)), new java.io.PrintWriter(new java.io.OutputStreamWriter(errorStream)), false, null, null);
}