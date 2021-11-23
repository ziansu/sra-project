public void actionPerformed(java.awt.event.ActionEvent ev) {
    try {
        javax.swing.JFileChooser fileOpen = new javax.swing.JFileChooser();
        fileOpen.showOpenDialog(frame);
        taskList.readFile(fileOpen.getSelectedFile());
        mainPanel.removeAll();
        mainPanel.revalidate();
        mainPanel.repaint();
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}