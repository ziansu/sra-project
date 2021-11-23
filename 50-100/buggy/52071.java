public void addToFileAt(java.lang.String path, int insertAt, java.lang.String toAdd) {
    java.util.List content = this.readFile(path);
    java.lang.System.out.println(content.size());
    for (int i = 0; i < (content.size()); ++i) {
        if (i == insertAt) {
            content.set(1, toAdd);
            break;
        }
    }
    this.overwriteFile(path, content);
}