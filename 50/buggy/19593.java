public static Vortex.System.Assets.Asset getAsset(java.lang.String key) {
    log(((((((Vortex.System.Assets.AssetManager.className) + "[") + key) + "] was grabbed from the [") + (Vortex.System.Assets.AssetManager.MAP_NAME)) + "]."));
    return Vortex.System.Assets.AssetManager.ASSET_MAP.get(key);
}