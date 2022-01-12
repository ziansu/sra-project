public com.badlogic.gdx.assets.AssetDescriptor<com.badlogic.gdx.graphics.Texture> getHealthDisplay() {
    switch (getHealthDegradation()) {
        case 0 :
            return AssetEnum.HEALTH_ICON_0.getTexture();
        case 1 :
            return AssetEnum.HEALTH_ICON_1.getTexture();
        case 2 :
            return AssetEnum.HEALTH_ICON_2.getTexture();
        case 3 :
            return AssetEnum.HEALTH_ICON_3.getTexture();
        case 4 :
            return AssetEnum.HEALTH_ICON_3.getTexture();
        case 5 :
            return AssetEnum.HEALTH_ICON_3.getTexture();
    }
    return null;
}