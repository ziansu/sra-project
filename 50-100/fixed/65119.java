public java.awt.image.BufferedImage getImage() throws java.io.IOException {
    if ((img) != null)
        return img;
    
    synchronized(this) {
        if ((img) != null)
            return img;
        
        byte[] content = getContent();
        if ((content != null) && ((content.length) > 0)) {
            img = javax.imageio.ImageIO.read(new java.io.ByteArrayInputStream(content));
            if (writtenToDisk)
                content = null;
            
        }
    }
    return img;
}