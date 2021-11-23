public static Vortex.System.Assets.Asset get(java.lang.String key) {
    key = key.toLowerCase();
    return Vortex.System.Assets.AssetManager.ASSET_MAP.get(key);
}