public void defineImage(java.awt.Image i, int id) {
    texturing.SubTexture newSubTexture = subTextures.get(id);
    newSubTexture.image = i;
    subTextures.set(id, newSubTexture);
}