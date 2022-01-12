public boolean isNew(org.intellimate.izou.sdk.frameworks.music.player.TrackInfo trackInfo) {
    return isNew(trackInfo.name, trackInfo.artist, trackInfo.album, trackInfo.albumCover, trackInfo.albumCoverFormat, trackInfo.data, trackInfo.year, trackInfo.genre, trackInfo.bmp, trackInfo.duration);
}