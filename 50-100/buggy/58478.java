public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    fileChooser.showDialog(this, "Open");
    try {
        java.io.File photo = fileChooser.getSelectedFile();
        if (photo != null)
            editorCanvas.loadImage(javax.imageio.ImageIO.read(photo));
        
    } catch (java.io.IOException ex) {
        javax.swing.JOptionPane.showMessageDialog(this, ex, "Error!", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}