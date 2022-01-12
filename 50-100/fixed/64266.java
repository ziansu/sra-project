public static void goPageBack(org.bukkit.entity.Player player) {
    if (pandemist.adrundaal.auctions.handler.Shop.isPlayerInPageList(player)) {
        int page = pandemist.adrundaal.auctions.handler.Shop.getPageByName(player);
        if (page > 1) {
            pandemist.adrundaal.auctions.handler.Shop.updatePageByName(player, (page--));
            pandemist.adrundaal.auctions.handler.ExtendetItemHandler.openShopByType(player);
        }
    }else {
        return ;
    }
}