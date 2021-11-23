@java.lang.Override
public boolean canInteractWith(net.minecraft.entity.player.EntityPlayer player) {
    return !(logistics.isInvalid());
}