public void setDiffuseTexture(com.mbrlabs.mundus.commons.assets.TextureAsset tex) {
    if ((model) == null)
        return ;
    
    for (com.badlogic.gdx.graphics.g3d.Material mat : model.materials) {
        com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute diffuse = new com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute(com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Diffuse, tex.getTexture());
        mat.set(diffuse);
    }
    getMeta().setDiffuseTexture(tex.getUUID());
    diffuseTexture = tex;
}