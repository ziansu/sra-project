private java.util.List<java.lang.String> getFileList(java.util.List<java.io.File> files) {
    java.util.List<java.lang.String> lines = new java.util.ArrayList<>();
    for (java.io.File f : files) {
        if (!(fileProgressPanel.contains(f)))
            continue;
        
        lines.add(java.lang.String.format("file '%s'", f.getAbsolutePath()));
    }
    return lines;
}