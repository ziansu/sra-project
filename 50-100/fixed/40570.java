public void createConfig(java.io.File file, java.io.InputStream input) {
    try {
        java.nio.file.Files.copy(input, file.toPath());
    } catch (java.io.IOException e) {
        it.mineblock.mbcore.Chat.getLogger(Errors.EXCEPTION.getError(Errors.CONFIG_CREATION.getError(e)), "severe");
        if (it.mineblock.mbcore.Reference.debug) {
            e.printStackTrace();
        }
    }
}