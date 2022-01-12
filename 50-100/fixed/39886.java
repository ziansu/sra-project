public void update() throws java.io.IOException {
    this.newFiles.clear();
    this.currFiles = java.util.Arrays.asList(adakite.util.AdakiteUtils.getDirectoryContents(this.path));
    for (java.nio.file.Path currFile : this.currFiles) {
        if (!(this.prevFiles.contains(currFile))) {
            this.newFiles.add(currFile);
        }
    }
}