public void init(com.badlogic.gdx.assets.AssetManager assetManager) {
    Gdx.app.debug("Assets", "Init Assets!");
    this.assetManager = assetManager;
    loaded = false;
    assetManager.setErrorListener(this);
    assetManager.load(Global.TEXTURE_ATLAS, com.badlogic.gdx.graphics.g2d.TextureAtlas.class);
    for (java.lang.String s : com.ttocsneb.stranded.util.Assets.ATLASES) {
        assetManager.load(s, com.badlogic.gdx.graphics.g2d.TextureAtlas.class);
    }
    com.ttocsneb.stranded.util.Assets.loadSounds(assetManager);
}