@java.lang.Override
protected void doRefresh() {
    java.io.File[] files = ((java.io.File[]) (get().getValue()));
    javax.swing.DefaultListModel<java.io.File> model = new javax.swing.DefaultListModel<>();
    for (java.io.File file : files) {
        model.addElement(file);
    }
    paths.setModel(model);
}