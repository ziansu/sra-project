public static com.bilibili.boxing.model.entity.AlbumEntity createDefaultAlbum() {
    com.bilibili.boxing.model.entity.AlbumEntity result = new com.bilibili.boxing.model.entity.AlbumEntity();
    result.mBucketId = com.bilibili.boxing.model.entity.AlbumEntity.DEFAULT_NAME;
    result.mIsSelected = true;
    return result;
}