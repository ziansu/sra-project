java.lang.String[] getFoldersInFolder(java.lang.String directory) {
    java.lang.String[] list = new java.io.File(directory).list(new java.io.FilenameFilter() {
        @java.lang.Override
        public boolean accept(java.io.File current, java.lang.String name) {
            return new java.io.File(current, name).isDirectory();
        }
    });
    if ((list == null) || ((list.length) == 0))
        return null;
    
    list = this.sortFileList(list);
    for (java.lang.String item : list) {
    }
    return list;
}