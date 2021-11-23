public void setTexture(java.lang.String key, org.gearvrf.GVRTexture texture) {
    checkStringNotNullOrEmpty("key", key);
    synchronized(textures) {
        org.gearvrf.GVRMaterial.TextureInfo tinfo = textures.get(key);
        if (tinfo == null) {
            tinfo = new org.gearvrf.GVRMaterial.TextureInfo();
            textures.put(key, tinfo);
        }
        if (texture != null) {
            tinfo.Texture = texture;
            org.gearvrf.NativeMaterial.setTexture(getNative(), key, texture.getNative());
        }
    }
}