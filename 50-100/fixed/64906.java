public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        FilePicker fileChooser = new FilePicker();
        MainWindow.inpuFilePath = fileChooser.getPath();
        MainWindow.filename = fileChooser.getName();
        MainWindow.compute_listsener_module1.setFileName(MainWindow.filename);
        MainWindow.compute_listsener_module1.setFilePath(MainWindow.inpuFilePath);
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
}