public void addFilenames(java.util.ArrayList<java.lang.String> files) {
    listModel.clear();
    for (int i = 0; i < (files.size()); i++) {
        java.lang.String[] parts = files.get(i).split(java.io.File.separator);
        listModel.addElement(parts[((parts.length) - 1)]);
    }
}