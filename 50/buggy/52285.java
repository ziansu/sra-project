public static boolean isRootAvailable() {
    return (com.stericson.RootShell.RootShell.findBinary("su").size()) > 0;
}