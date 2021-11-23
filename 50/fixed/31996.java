public org.cp.elements.process.ProcessAdapter execute(java.io.File directory, java.lang.Class<?> type, java.lang.String... args) {
    return super.execute(directory, toJavaCommandLine(type, args));
}