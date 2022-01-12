public static void loadLibrary(java.lang.String name) {
    com.google.common.base.Optional<java.nio.file.Path> path = org.sosy_lab.common.NativeLibraries.findPathForLibrary(name);
    if (path.isPresent()) {
        java.lang.System.load(path.get().toAbsolutePath().toString());
    }
    java.lang.System.loadLibrary(name);
}