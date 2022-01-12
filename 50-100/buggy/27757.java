public void save() {
    for (com.al.json2model.general.ClassFile file : files) {
        byte[] bytes = file.getContents().getBytes();
        try {
            java.nio.file.Files.write(java.nio.file.Paths.get(file.getFullPath()), bytes, java.nio.file.StandardOpenOption.CREATE);
        } catch (java.io.IOException e) {
            java.lang.System.err.println(e.getMessage());
        }
    }
}