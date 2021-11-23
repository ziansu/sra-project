public static boolean addShop(com.tealcube.minecraft.spigot.metashop.shops.Shop shop) {
    com.tealcube.minecraft.spigot.metashop.common.Preconditions.checkNotNull(shop, "shop cannot be null");
    com.tealcube.minecraft.spigot.metashop.managers.ShopManager.SHOP_MAP.put(shop.getId(), shop);
    return com.tealcube.minecraft.spigot.metashop.managers.ShopManager.hasShop(shop);
}