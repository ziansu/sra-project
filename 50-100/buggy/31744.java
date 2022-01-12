public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String[] files = function.search();
    listModel.clear();
    for (java.lang.String string : files) {
        if (string != null) {
            listModel.addElement(string);
        }
    }
}