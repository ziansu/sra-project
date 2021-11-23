public void setTexture(java.lang.String key, org.gearvrf.GVRTexture texture) {
    checkStringNotNullOrEmpty("key", key);
    org.gearvrf.GVRMaterial.TextureInfo tinfo = textures.get(key);
    if (tinfo == null) {
        tinfo = new org.gearvrf.GVRMaterial.TextureInfo();
        tinfo.Texture = texture;
        textures.put(key, tinfo);
    }else {
        tinfo.Texture = texture;
    }
    if (texture != null)
        org.gearvrf.NativeMaterial.setTexture(getNative(), key, texture.getNative());
    
}