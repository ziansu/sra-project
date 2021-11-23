@java.lang.Override
public boolean onBlockDestroyed(net.minecraft.item.ItemStack stack, net.minecraft.world.World world, net.minecraft.block.Block block, int x, int y, int z, net.minecraft.entity.player.EntityPlayer player) {
    int meta = world.getBlockMetadata(x, y, z);
    if (canHarvestBlock(stack, block, meta, player)) {
        double energyConsumption = net.machinemuse.api.ModuleManager.computeModularProperty(stack, net.machinemuse.powersuits.powermodule.tool.AxeModule.AXE_ENERGY_CONSUMPTION);
        net.machinemuse.utils.ElectricItemUtils.drainPlayerEnergy(player, energyConsumption);
        return true;
    }
    return false;
}