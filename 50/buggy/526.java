public static void init() {
    java.util.List<net.epoxide.tinker.client.render.textures.TileTexture> textureList = java.util.Arrays.asList(net.epoxide.tinker.client.render.textures.TextureManager.REGISTRY.getValues());
    net.epoxide.tinker.client.render.textures.ResourceLoading resourceLoading = new net.epoxide.tinker.client.render.textures.ResourceLoading();
    resourceLoading.load(net.epoxide.tinker.client.render.textures.TextureManager.REGISTRY);
    net.epoxide.tinker.client.render.textures.TextureManager.texture = new net.epoxide.tinker.client.render.textures.packer.TexturePacker().packImages(textureList);
}