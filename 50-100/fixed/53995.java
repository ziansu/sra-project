protected static boolean isIntegratedKaraf(java.io.File location) {
    java.io.File libFolder = new java.io.File(((location + (java.io.File.separator)) + "lib"));
    java.io.File[] files = libFolder.listFiles((java.io.File dir,java.lang.String name) -> name.toLowerCase().endsWith("-version.jar"));
    return (files.length) > 0;
}