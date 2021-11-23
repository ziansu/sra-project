private void performAction() throws java.io.IOException, java.lang.ClassNotFoundException {
    java.lang.Integer typeOfObject = ((java.lang.Integer) (in.readObject()));
    if (typeOfObject.equals(Servant.IMAGE)) {
        java.awt.image.BufferedImage bimg = camera.takePicture();
        javax.swing.ImageIcon imgIcon = new javax.swing.ImageIcon(bimg);
        out.writeObject(imgIcon);
    }else
        if (typeOfObject.equals(Servant.END)) {
            destroyServant();
        }
    
}