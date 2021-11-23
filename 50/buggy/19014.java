public static com.bilibili.boxing.model.entity.AlbumEntity createDefaultAlbum() {
    com.bilibili.boxing.model.entity.AlbumEntity result = new com.bilibili.boxing.model.entity.AlbumEntity();
    result.mBucketId = com.bilibili.boxing.model.entity.AlbumEntity.DEFAULT_NAME;
    result.mBucketName = "所有相片";
    result.mIsSelected = true;
    return result;
}