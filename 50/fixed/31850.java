public java.lang.String getUnlocalizedName(net.minecraft.item.ItemStack stk) {
    return "tile." + (tb.common.block.BlockTBLog.names[java.lang.Math.min(BlockTBLog.names.length, ((stk.getItemDamage()) % 4))]);
}