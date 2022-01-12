@java.lang.Override
public boolean supports(org.spongepowered.api.data.DataHolder dataHolder) {
    return ((dataHolder instanceof net.minecraft.entity.passive.EntitySheep) || (dataHolder instanceof net.minecraft.item.ItemStack)) || (dataHolder instanceof net.minecraft.world.IWorldNameable);
}