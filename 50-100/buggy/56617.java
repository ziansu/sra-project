private static java.lang.String[] imgnames(java.lang.String imgpath) {
    java.io.File fsource = new java.io.File(imgpath);
    java.io.FilenameFilter textFilter = new java.io.FilenameFilter() {
        @java.lang.Override
        public boolean accept(java.io.File fsource, java.lang.String name) {
            if (name.endsWith(".bmp")) {
                return true;
            }else {
                return false;
            }
        }
    };
    java.lang.String[] bmpfiles = fsource.list(textFilter);
    return bmpfiles;
}