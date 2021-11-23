@java.lang.Override
public minetweaker.api.item.IItemStack transform(minetweaker.api.item.IItemStack item, minetweaker.api.player.IPlayer byPlayer) {
    if ((item.getAmount()) > 1) {
        byPlayer.give(withItem);
        return item;
    }else {
        return withItem.withAmount(withItem.getAmount());
    }
}