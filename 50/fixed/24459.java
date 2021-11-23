public org.cp.elements.process.ProcessAdapter execute(java.io.File directory, java.io.File jarFile, java.lang.String... args) {
    return super.execute(directory, toJavaCommandLine(jarFile, args));
}