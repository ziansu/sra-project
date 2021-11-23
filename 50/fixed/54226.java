public static void addPack(java.lang.String packLocation, java.lang.String key) {
    com.badlogic.gdx.graphics.g2d.TextureAtlas atlas = new com.badlogic.gdx.graphics.g2d.TextureAtlas(Gdx.files.internal(packLocation));
    com.ahcobos.greencore.assests.AssetsLoaderModel.packs.put(key, atlas);
}