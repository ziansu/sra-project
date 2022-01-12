@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.io.File file = wraith.lib.util.Algorithms.userChooseImage("Select Image", "Select");
    try {
        image = javax.imageio.ImageIO.read(file);
        imagePanel.setImage(image);
    } catch (java.lang.Exception exception) {
        exception.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(null, "Default image failed to load!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        image = null;
    }
}