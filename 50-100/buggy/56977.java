private boolean getItem(org.bukkit.entity.LivingEntity caster, java.lang.String item) {
    java.util.Optional<io.lumine.xikage.mythicmobs.items.MythicItem> maybeItem;
    if ((maybeItem = this.mythicmobs.getItemManager().getItem(itemString)).isPresent()) {
        io.lumine.xikage.mythicmobs.items.MythicItem mi = maybeItem.get();
        caster.getEquipment().setHelmet(io.lumine.xikage.mythicmobs.adapters.bukkit.BukkitAdapter.adapt(mi.generateItemStack(1)));
        return true;
    }
    return false;
}