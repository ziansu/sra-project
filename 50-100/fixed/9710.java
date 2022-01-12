@java.lang.Override
public boolean onBlockActivated(net.minecraft.entity.player.EntityPlayer entityPlayer, mods.eln.misc.Direction side, float vx, float vy, float vz) {
    if (onBlockActivatedRotate(entityPlayer)) {
        return true;
    }else {
        return inventory.take(entityPlayer.getCurrentEquippedItem(), this, false, true);
    }
}