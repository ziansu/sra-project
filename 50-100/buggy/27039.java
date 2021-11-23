public static void main(java.lang.String[] args) {
    java.lang.System.out.println("Hello Platform!");
    try {
        java.nio.file.Path dir = java.nio.file.Paths.get(homework5.pluginframework.gui.Platform.PLATFORM_DIRECTORY);
        homework5.pluginframework.gui.Platform platform = new homework5.pluginframework.gui.Platform(dir);
        platform.processEvents();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}