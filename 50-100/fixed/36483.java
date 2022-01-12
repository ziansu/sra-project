private void copyImageRange(int start, int end, java.nio.file.Path directory) {
    for (int i = start; i <= end; i++) {
        java.io.File old = images.get(i).source;
        java.nio.file.Path newer = directory.resolve(old.getName());
        try {
            java.nio.file.Files.copy(old.toPath(), newer, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}