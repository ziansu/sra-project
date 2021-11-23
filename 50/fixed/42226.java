public static boolean isExit() {
    java.io.File files = new java.io.File("/sdcard/wltlib");
    return files.exists();
}