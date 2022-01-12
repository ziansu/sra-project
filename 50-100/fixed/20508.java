protected boolean shouldBlockDamage(net.minecraft.entity.Entity entity) {
    if (!(entity instanceof net.minecraft.entity.player.EntityPlayer)) {
        return false;
    }
    net.minecraft.entity.player.EntityPlayer player = ((net.minecraft.entity.player.EntityPlayer) (entity));
    if ((!(player.isActiveItemStackBlocking())) || ((player.getActiveItemStack().getItem()) != (this))) {
        return false;
    }
    return !(slimeknights.tconstruct.library.utils.ToolHelper.isBroken(player.getActiveItemStack()));
}