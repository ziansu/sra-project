private me.drton.jmavsim.Texture2D loadTexture(java.lang.String fn) {
    com.sun.j3d.utils.image.TextureLoader texLoader = new com.sun.j3d.utils.image.TextureLoader(fn, null);
    me.drton.jmavsim.Texture2D texture = ((me.drton.jmavsim.Texture2D) (texLoader.getTexture()));
    if (texture == null)
        java.lang.System.err.println(("Cannot load texture from " + fn));
    else {
        texture.setEnable(true);
    }
    return texture;
}