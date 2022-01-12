@java.lang.SuppressWarnings(value = "unchecked")
public com.parachute.common.ActionResult<net.minecraft.item.ItemStack> onItemRightClick(net.minecraft.item.ItemStack itemstack, net.minecraft.world.World world, net.minecraft.entity.player.EntityPlayer entityplayer, com.parachute.common.EnumHand hand) {
    boolean result;
    if (((entityplayer != null) && (com.parachute.common.ParachuteCommonProxy.isFalling(entityplayer))) && ((entityplayer.getRidingEntity()) == null)) {
        result = deployParachute(world, entityplayer);
    }else {
        result = toggleAAD(itemstack, world, entityplayer);
    }
    return new com.parachute.common.ActionResult(EnumActionResult.SUCCESS, itemstack);
}