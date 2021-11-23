public void setTexCoord(java.lang.String texName, java.lang.String texCoordAttr, java.lang.String shaderVarName) {
    synchronized(textures) {
        org.gearvrf.GVRMaterial.TextureInfo tinfo = textures.get(texName);
        if (tinfo == null) {
            tinfo = new org.gearvrf.GVRMaterial.TextureInfo();
            textures.put(texName, tinfo);
        }
        tinfo.TexCoordAttr = texCoordAttr;
        tinfo.ShaderVar = shaderVarName;
    }
}