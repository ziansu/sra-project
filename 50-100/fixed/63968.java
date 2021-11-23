@java.lang.Override
public void update(net.minecraft.item.ItemStack stack, xreliquary.api.IPedestal pedestal) {
    net.minecraft.util.math.BlockPos pos = pedestal.getBlockPos();
    int bucketRange = Settings.Pedestal.bucketWrapperRange;
    if (!(milkCows(pedestal, pos, bucketRange, stack))) {
        if (!(drainLiquid(pedestal, pos, bucketRange))) {
            pedestal.setActionCoolDown((2 * (Settings.Pedestal.bucketWrapperCooldown)));
            return ;
        }
    }
    pedestal.setActionCoolDown(Settings.Pedestal.bucketWrapperCooldown);
}