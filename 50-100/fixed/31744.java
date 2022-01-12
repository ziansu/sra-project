public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String[] files = function.search();
    listModel.clear();
    for (int i = 0; i < ((files.length) - 1); i++) {
        if ((files[i]) != null) {
            listModel.addElement(files[i]);
        }
    }
}