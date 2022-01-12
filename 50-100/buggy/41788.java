public static final void Clear() {
    try {
        final java.lang.String os = java.lang.System.getProperty("os.name");
        if (os.contains("Windows")) {
            java.lang.Runtime.getRuntime().exec("cls");
        }else {
            java.lang.Runtime.getRuntime().exec("clear");
        }
    } catch (final java.lang.Exception e) {
        e.printStackTrace();
    }
}