@java.lang.Override
public boolean setDestination(net.minecraft.item.ItemStack ticket) {
    if ((this.entityMainTrain) != null) {
        return this.entityMainTrain.setDestination(ticket);
    }
    return false;
}