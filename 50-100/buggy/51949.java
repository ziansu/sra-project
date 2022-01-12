private void setImageToCommand(java.io.File imgFile) {
    if (!(imgFile.exists()))
        return ;
    
    touchyou.Command current = touchyou.util.Controller.getInstance().getCurrentCommand();
    if ((current.getImage()) != (touchyou.Command.BLANK_IMAGE)) {
        return ;
    }
    try {
        java.awt.image.BufferedImage image = javax.imageio.ImageIO.read(imgFile);
        current.setImage(image);
        touchyou.util.Controller.getInstance().updateCurrentCommand();
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
}