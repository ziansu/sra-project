public static org.jackhuang.hellominecraft.utils.Platform getPlatform() {
    java.lang.String arch = java.lang.System.getProperty("os.arch");
    return arch.contains("64") ? org.jackhuang.hellominecraft.utils.Platform.BIT_64 : org.jackhuang.hellominecraft.utils.Platform.BIT_32;
}