@java.lang.Override
public minetweaker.api.item.IItemStack transform(minetweaker.api.item.IItemStack item, minetweaker.api.player.IPlayer byPlayer) {
    return item.withAmount(item.getAmount());
}