public static org.jackhuang.hellominecraft.utils.Platform getPlatform() {
    return java.lang.System.getProperty("os.arch").contains("64") ? org.jackhuang.hellominecraft.utils.Platform.BIT_64 : org.jackhuang.hellominecraft.utils.Platform.BIT_32;
}