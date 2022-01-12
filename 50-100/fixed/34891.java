public void setSource(java.lang.String stringVar) {
    this.url = stringVar;
    try {
        this.bufferedImage = javax.imageio.ImageIO.read(new java.io.File(("resources/" + (this.url))));
    } catch (java.lang.Exception e) {
        if ((this.gameVar) != null)
            this.bufferedImage = this.gameVar.getErrorImage();
        
    }
}