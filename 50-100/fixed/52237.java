@java.lang.Override
public minetweaker.api.item.IItemStack transform(minetweaker.api.item.IItemStack item, minetweaker.api.player.IPlayer byPlayer) {
    java.lang.System.out.println(("Transform damage: " + item));
    int newDamage = (item.getDamage()) + damage;
    if (newDamage >= (item.getMaxDamage())) {
        return item.withAmount(item.getAmount()).withDamage(0);
    }else {
        return item.withAmount(item.getAmount()).withDamage(newDamage);
    }
}