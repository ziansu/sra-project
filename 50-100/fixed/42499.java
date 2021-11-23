public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        FilePicker fileChooser = new FilePicker();
        MainWindow.inpuFilePath = fileChooser.getPath();
        MainWindow.filename = fileChooser.getName();
        compute_listsener_module3.setFileName(MainWindow.filename);
        compute_listsener_module3.setFilePath(MainWindow.inpuFilePath);
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
}