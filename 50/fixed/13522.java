public static synchronized void offerTextureId(int textureId) {
    if (textureId > (-1)) {
        org.zhgeaits.zgdanmaku.utils.TexturePool.mPool.add(textureId);
    }
}