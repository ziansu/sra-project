@java.lang.Override
public void queueAssets(com.badlogic.gdx.assets.AssetManager assets) {
    shop.setAssetManager(manager);
    shop.queueAssets(manager);
    assets.load(shopAtlas, com.badlogic.gdx.graphics.g2d.TextureAtlas.class);
    assets.load(shopSkin, lambda.viewcontroller.shop.Skin.class, new com.badlogic.gdx.assets.loaders.SkinLoader.SkinParameter(shopSkin));
    assets.load(dropDownMenuSkin, lambda.viewcontroller.shop.Skin.class);
    assets.load(dropDownMenuAtlas, com.badlogic.gdx.graphics.g2d.TextureAtlas.class);
}