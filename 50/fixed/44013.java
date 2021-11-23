public static void dispose() {
    for (com.skylar.gdx.utils.FileLoaderUtils.TextureID textureID : com.skylar.gdx.utils.FileLoaderUtils.TEXTURE_MAP.keySet()) {
        com.badlogic.gdx.graphics.Texture texture = com.skylar.gdx.utils.FileLoaderUtils.TEXTURE_MAP.get(textureID);
        texture.dispose();
    }
}