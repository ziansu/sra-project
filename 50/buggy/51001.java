public void offerCache(com.mojang.authlib.GameProfile profile) {
    offerCache(profile, org.torch.server.cache.TorchUserCache.warpExpireDate(false));
}