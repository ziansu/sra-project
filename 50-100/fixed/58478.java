public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    fileChooser.showDialog(this, "Open");
    try {
        java.io.File photo = fileChooser.getSelectedFile();
        editorCanvas.loadImage(javax.imageio.ImageIO.read(photo));
    } catch (java.io.IOException ex) {
        java.lang.System.out.println("Error!");
    }
}