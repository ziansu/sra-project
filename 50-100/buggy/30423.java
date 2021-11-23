private java.awt.Color scaling(java.awt.image.BufferedImage img, java.awt.Rectangle rtoscan) throws java.lang.Exception {
    if (img == null)
        throw new java.lang.Exception((((g.toString()) + "\n") + (rtoscan.toString())));
    
    g.drawImage(img.getSubimage(rtoscan.x, rtoscan.y, rtoscan.width, rtoscan.height), 0, 0, 1, 1, null);
    return new java.awt.Color(img2.getRGB(0, 0), true);
}