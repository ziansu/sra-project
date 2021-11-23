private com.jme3.asset.TextureKey setupMockForTexture(final java.lang.String paramName, final java.lang.String path, final boolean flipY, final com.jme3.texture.Texture texture) {
    org.mockito.Mockito.when(materialDef.getMaterialParam(paramName)).thenReturn(new com.jme3.material.MatParamTexture(com.jme3.shader.VarType.Texture2D, paramName, texture, 0, null));
    final com.jme3.asset.TextureKey textureKey = new com.jme3.asset.TextureKey(path, flipY);
    textureKey.setGenerateMips(true);
    org.mockito.Mockito.when(assetManager.loadTexture(textureKey)).thenReturn(texture);
    return textureKey;
}