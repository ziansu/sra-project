@java.lang.Override
public void update(net.minecraft.entity.player.EntityPlayer player) {
    if (player.isCollidedHorizontally) {
        player.fallDistance = 0.0F;
        player.motionY = (player.isSneaking()) ? 0 : 0.2;
    }
}