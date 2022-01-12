@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public void registerTexture(int index, java.lang.String spriteName, net.minecraft.client.renderer.texture.TextureMap textureMap) {
    if (index >= (this.textures.length)) {
        EnderUtilities.logger.fatal(("Index out of bounds in ItemEnderUtilities.registerTexture(): " + index));
        return ;
    }
    textureMap.setTextureEntry(fi.dy.masa.enderutilities.reference.ReferenceTextures.getItemTextureName(spriteName), new fi.dy.masa.enderutilities.client.resources.TextureItems(fi.dy.masa.enderutilities.reference.ReferenceTextures.getItemTextureName(spriteName)));
    this.textures[index] = textureMap.getTextureExtry(fi.dy.masa.enderutilities.reference.ReferenceTextures.getItemTextureName(spriteName));
    this.texture_names[index] = fi.dy.masa.enderutilities.reference.ReferenceTextures.getItemTextureName(spriteName);
}