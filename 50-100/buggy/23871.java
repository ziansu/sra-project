public java.awt.Image getCurBG() {
    if ((curFrame.getBG()) < 0)
        try {
            return javax.imageio.ImageIO.read(new java.io.File((((("src" + (java.io.File.separator)) + "createdGameClasses") + (java.io.File.separator)) + "whitePic.png")));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    
    return bgList.get(((curFrame.getBG()) + (createdGameClasses.GameController.bgOffset)));
}