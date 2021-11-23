@java.lang.Override
public int getHarvestLevel(net.minecraft.item.ItemStack stack, java.lang.String toolClass, @javax.annotation.Nullable
net.minecraft.entity.player.EntityPlayer player, @javax.annotation.Nullable
net.minecraft.block.state.IBlockState blockState) {
    return am2.utils.SpellUtils.getModifiedInt_Add(2, stack, ((net.minecraft.entity.EntityLivingBase) (player)), ((net.minecraft.entity.EntityLivingBase) (player)), player.getEntityWorld(), SpellModifiers.MINING_POWER);
}