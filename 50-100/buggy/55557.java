protected net.minecraft.item.ItemStack getProjectileStack(net.minecraft.item.ItemStack itemStack, net.minecraft.world.World world, net.minecraft.entity.player.EntityPlayer player, boolean usedAmmo) {
    net.minecraft.item.ItemStack reference = itemStack.copy();
    reference.setCount(1);
    setAmmo(1, reference);
    if (((!(player.capabilities.isCreativeMode)) && (!(world.isRemote))) && (!usedAmmo)) {
        reference.setCount(0);
        setAmmo(0, reference);
    }
    slimeknights.tconstruct.library.utils.ToolHelper.unbreakTool(reference);
    return reference;
}