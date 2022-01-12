public static java.lang.String[] getFilesList(java.lang.String path) {
    java.io.File file = new java.io.File(path);
    java.lang.String[] directories = file.list(new java.io.FilenameFilter() {
        @java.lang.Override
        public boolean accept(java.io.File current, java.lang.String name) {
            return new java.io.File(current, name).isFile();
        }
    });
    return directories;
}