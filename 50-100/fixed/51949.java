private void setImageToCommand(java.io.File imgFile) {
    if (!(imgFile.exists()))
        return ;
    
    try {
        touchyou.Command current = touchyou.util.Controller.getInstance().getCurrentCommand();
        java.awt.image.BufferedImage image = javax.imageio.ImageIO.read(imgFile);
        current.setImage(image);
        touchyou.util.Controller.getInstance().updateCurrentCommand();
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
}