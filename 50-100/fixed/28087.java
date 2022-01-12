public static net.goldiriath.plugin.game.skill.type.WeaponType getWeaponType(org.bukkit.inventory.ItemStack stack) {
    if (stack == null) {
        return null;
    }
    switch (stack.getType()) {
        case WOOD_SWORD :
        case STONE_SWORD :
        case GOLD_SWORD :
        case IRON_SWORD :
        case DIAMOND_SWORD :
            return net.goldiriath.plugin.game.skill.type.WeaponType.SWORD;
        case BOW :
            return net.goldiriath.plugin.game.skill.type.WeaponType.BOW;
        case EMERALD :
            return net.goldiriath.plugin.game.skill.type.WeaponType.WAND;
        case SHEARS :
            return net.goldiriath.plugin.game.skill.type.WeaponType.KNIFE;
    }
    return null;
}