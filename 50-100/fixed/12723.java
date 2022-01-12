@java.lang.Override
public org.bukkit.entity.Item dropItem(org.bukkit.Location location, org.bukkit.inventory.ItemStack item) {
    com.google.common.base.Optional<org.bukkit.entity.Entity> created = getHandle().createEntity(EntityTypes.DROPPED_ITEM, blue.lapis.pore.converter.vector.VectorConverter.create3d(location));
    if (!(created.isPresent())) {
        return null;
    }
    assert created instanceof org.bukkit.entity.Item;
    org.bukkit.entity.Item drop = ((org.bukkit.entity.Item) (created));
    throw new org.apache.commons.lang.NotImplementedException();
}