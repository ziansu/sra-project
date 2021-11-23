public void saveHotkeys() {
    java.io.File tempHotkeysFile = new java.io.File(((hotkeysFile.toString()) + ".temp"));
    try (java.io.ObjectOutputStream hotkeysOut = new java.io.ObjectOutputStream(new java.io.FileOutputStream(tempHotkeysFile))) {
        hotkeysOut.writeObject(hotkeys.getMap());
        hotkeysOut.flush();
        hotkeysOut.close();
        java.nio.file.Files.move(tempHotkeysFile.toPath(), hotkeysFile.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}