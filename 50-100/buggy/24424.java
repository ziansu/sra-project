public static de.nerogar.render.Texture2D loadTexture(java.lang.String filename, java.lang.String textureName, de.nerogar.render.Texture2D.InterpolationType interpolationType) {
    de.nerogar.render.Texture2D retTexture = de.nerogar.render.TextureLoader.textureMap.get(filename);
    if (retTexture != null)
        return retTexture;
    
    try {
        java.awt.image.BufferedImage image = javax.imageio.ImageIO.read(new java.io.File(filename));
        return de.nerogar.render.TextureLoader.loadTexture(image, textureName, interpolationType);
    } catch (java.io.IOException e) {
        e.printStackTrace();
        java.lang.System.err.println(("Missing Texture: " + filename));
    }
    de.nerogar.render.TextureLoader.textureMap.put(filename, retTexture);
    return retTexture;
}