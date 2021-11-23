public com.badlogic.gdx.assets.AssetDescriptor<com.badlogic.gdx.graphics.Texture> getManaDisplay() {
    switch (4 - (((int) ((getManaPercent()) * 100)) / 25)) {
        case 0 :
            return AssetEnum.MANA_ICON_0.getTexture();
        case 1 :
            return AssetEnum.MANA_ICON_1.getTexture();
        case 2 :
            return AssetEnum.MANA_ICON_2.getTexture();
        case 3 :
            return AssetEnum.MANA_ICON_3.getTexture();
        case 4 :
            return AssetEnum.MANA_ICON_3.getTexture();
        default :
            return AssetEnum.MANA_ICON_3.getTexture();
    }
}