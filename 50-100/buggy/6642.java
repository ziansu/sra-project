private java.lang.String getOwnerName(org.cubeengine.module.signmarket.data.MarketSignData data) {
    if (data.isAdminOwner()) {
        return "Server";
    }
    org.spongepowered.api.service.user.UserStorageService uss = org.spongepowered.api.Sponge.getServiceManager().provide(org.spongepowered.api.service.user.UserStorageService.class).get();
    return uss.get(org.spongepowered.api.profile.GameProfile.of(data.getOwner(), null)).map(User::getName).orElse("???");
}