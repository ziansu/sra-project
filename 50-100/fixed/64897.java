@java.lang.Override
public org.bukkit.inventory.InventoryHolder getHolder() {
    if ((this.getHandle()) instanceof org.spongepowered.api.item.inventory.types.CarriedInventory) {
        com.google.common.base.Optional<?> carrier = ((org.spongepowered.api.item.inventory.types.CarriedInventory) (this.getHandle())).getCarrier();
        if (carrier.isPresent()) {
            return blue.lapis.pore.impl.inventory.PoreInventoryHolder.of(((org.spongepowered.api.item.inventory.Carrier) (carrier.get())));
        }
    }
    return null;
}