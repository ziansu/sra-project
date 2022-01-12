public com.yalin.style.domain.AdvanceWallpaper transform(com.yalin.style.data.entity.AdvanceWallpaperEntity wallpaperEntity) {
    com.fernandocejas.arrow.checks.Preconditions.checkNotNull(wallpaperEntity, "Wallpaper can not be null.");
    com.yalin.style.domain.AdvanceWallpaper wallpaper = new com.yalin.style.domain.AdvanceWallpaper();
    wallpaper.id = wallpaperEntity.id;
    wallpaper.wallpaperId = wallpaperEntity.wallpaperId;
    wallpaper.link = wallpaperEntity.link;
    wallpaper.name = wallpaperEntity.name;
    wallpaper.author = wallpaperEntity.author;
    wallpaper.iconUrl = wallpaperEntity.iconUrl;
    wallpaper.downloadUrl = wallpaperEntity.downloadUrl;
    wallpaper.providerName = wallpaperEntity.providerName;
    wallpaper.storePath = wallpaperEntity.storePath;
    wallpaper.isDefault = wallpaperEntity.isDefault;
    wallpaper.isSelected = wallpaperEntity.isSelected;
    return wallpaper;
}