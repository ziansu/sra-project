public static synchronized void offerTextureId(int textureId) {
    org.zhgeaits.zgdanmaku.utils.TexturePool.mPool.offer(textureId);
}