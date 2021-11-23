@java.lang.Override
public boolean verify(org.spongepowered.api.entity.living.Living living) {
    java.util.Optional<net.minecraft.item.ItemStack> optHeld = ((org.spongepowered.api.entity.ArmorEquipable) (living)).getItemInHand();
    if ((optHeld.isPresent()) && ((optHeld.get().getItem()) == (com.skelril.skree.content.registry.item.CustomItemTypes.TWO_TAILED_SWORD))) {
        event.setBaseDamage(0);
        return true;
    }
    return false;
}