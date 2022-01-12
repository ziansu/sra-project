private void compile(java.lang.String pattern, java.io.File sourceDir, java.io.File outputDir, java.lang.Compiler compiler) {
    org.codehaus.plexus.util.DirectoryScanner scanner = new org.codehaus.plexus.util.DirectoryScanner();
    scanner.setBasedir(sourceDir);
    scanner.setIncludes(new java.lang.String[]{ pattern });
    scanner.scan();
    compiler.compile(com.google.common.collect.Lists.newArrayList(scanner.getIncludedFiles()), sourceDir, outputDir);
}