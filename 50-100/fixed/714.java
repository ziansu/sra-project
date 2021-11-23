private void open(java.io.File f) {
    if (f.isDirectory()) {
        if (f.getName().equals("..")) {
            cd(parent);
            ls();
        }else {
            cd(f.getAbsolutePath());
            ls();
        }
    }else {
        openFile(f.getAbsolutePath());
    }
}