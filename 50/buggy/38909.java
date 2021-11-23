public static void close() {
    java.lang.System.out.println("test");
    com.gridreconstructor.util.Util.writeObject(com.gridreconstructor.util.Util.settings, com.gridreconstructor.util.Util.SETTINGS_PATH);
}