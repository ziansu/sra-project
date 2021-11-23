public static org.sosy_lab.common.io.Path getNativeLibraryPath() {
    if ((org.sosy_lab.common.NativeLibraries.nativePath) == null) {
        java.lang.String arch = org.sosy_lab.common.NativeLibraries.Architecture.guessVmArchitecture().name().toLowerCase();
        java.lang.String os = org.sosy_lab.common.NativeLibraries.OS.guessOperatingSystem().name().toLowerCase();
        org.sosy_lab.common.NativeLibraries.nativePath = org.sosy_lab.common.NativeLibraries.getPathToJar().getParent().getParent().resolve(org.sosy_lab.common.io.Paths.get("native", ((arch + "-") + os)));
    }
    return org.sosy_lab.common.NativeLibraries.nativePath;
}