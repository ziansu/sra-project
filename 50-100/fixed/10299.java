private void prepareUV(com.graphicsengine.spritemesh.PropertyMapper mapper, int spriteCount, int index) {
    for (int i = 0; i < spriteCount; i++) {
        if ((getTexture(Texture2D.TEXTURE_0).type) == (com.nucleus.texturing.TextureType.TiledTexture2D)) {
            com.nucleus.geometry.MeshBuilder.prepareTiledUV(mapper, attributeData, (index + i));
        }else
            if ((getTexture(Texture2D.TEXTURE_0).type) == (com.nucleus.texturing.TextureType.UVTexture2D)) {
            }else {
                throw new java.lang.IllegalArgumentException();
            }
        
    }
}