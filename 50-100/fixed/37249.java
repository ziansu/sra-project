public void addFilenames(java.util.ArrayList<java.lang.String> files) {
    listModel.clear();
    for (int i = 0; i < (files.size()); i++) {
        java.io.File f = new java.io.File(files.get(i));
        listModel.addElement(f.getName());
    }
}