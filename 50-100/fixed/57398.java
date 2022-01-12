public static void goPageNext(org.bukkit.entity.Player player) {
    if (pandemist.adrundaal.auctions.handler.Shop.isPlayerInPageList(player)) {
        int page = pandemist.adrundaal.auctions.handler.Shop.getPageByName(player);
        if (page < (pandemist.adrundaal.auctions.handler.Shop.getMaxPageByName(player))) {
            pandemist.adrundaal.auctions.handler.Shop.updatePageByName(player, (page++));
            pandemist.adrundaal.auctions.handler.ExtendetItemHandler.openShopByType(player);
        }
    }else {
        return ;
    }
}