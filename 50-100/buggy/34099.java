public static void add(Vortex.System.Assets.Asset asset, boolean isLoadable) {
    if (!(Vortex.System.Assets.AssetManager.checkMap(asset.getKey()))) {
        Vortex.System.Assets.AssetManager.ASSET_MAP.put(asset.getKey(), asset);
        if (isLoadable)
            if (!(asset.isLoaded()))
                Vortex.System.Assets.AssetManager.ASSET_STACK.push(asset);
            
        
        Vortex.System.ErrorHandler.success(Vortex.System.Assets.AssetManager.CLASS_NAME, asset.getKey(), Vortex.System.Assets.AssetManager.MAP_NAME);
    }else {
        (Vortex.System.Assets.AssetManager.errorCount)++;
        Vortex.System.Assets.AssetManager.handleDuplicateKeys(asset, Vortex.System.Assets.AssetManager.errorCount);
        return ;
    }
}