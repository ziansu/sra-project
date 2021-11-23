public com.badlogic.gdx.assets.AssetDescriptor<com.badlogic.gdx.graphics.Texture> getStaminaDisplay() {
    switch (getStaminaDegradation()) {
        case 0 :
            return AssetEnum.STAMINA_ICON_0.getTexture();
        case 1 :
            return AssetEnum.STAMINA_ICON_1.getTexture();
        case 2 :
            return AssetEnum.STAMINA_ICON_2.getTexture();
        case 3 :
            return AssetEnum.STAMINA_ICON_3.getTexture();
        case 4 :
            return AssetEnum.STAMINA_ICON_3.getTexture();
    }
    return null;
}