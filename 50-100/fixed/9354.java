public static java.io.File getCurrentDir() {
    try {
        return new java.io.File(redempt.inputscripter2.Main.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile();
    } catch (java.net.URISyntaxException e) {
        e.printStackTrace();
    }
    return null;
}