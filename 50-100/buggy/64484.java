private void addToList(java.nio.file.Path p) {
    java.nio.file.PathMatcher matcher = java.nio.file.FileSystems.getDefault().getPathMatcher("glob:**.{BIN,TXT,JPG}");
    if (matcher.matches(p)) {
        if (!(filePaths.contains(p))) {
            filePaths.add(p.getFileName());
        }
        java.lang.System.out.println(("path added to list: " + p));
    }
}