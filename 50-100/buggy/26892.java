public void deleteLines(java.lang.String path, int start, int end) {
    if (((end >= start) && (start >= 0)) && (end >= 0)) {
        java.util.List content = this.readFile(path);
        if (end < (content.size())) {
            for (int i = start; i <= end; ++i) {
                content.remove(i);
            }
            this.overwriteFile(path, content);
        }
    }
}