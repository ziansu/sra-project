@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public void getSubBlocks(net.minecraft.item.Item itemIn, net.minecraft.creativetab.CreativeTabs tab, java.util.List<net.minecraft.item.ItemStack> list) {
    if (this.hasSubBlocks) {
        list.add(new net.minecraft.item.ItemStack(this, 1, com.nik7.upgcraft.block.BlockUpgCTank.TankType.SOLID.getMeta()));
        list.add(new net.minecraft.item.ItemStack(this, 1, com.nik7.upgcraft.block.BlockUpgCTank.TankType.GLASSES.getMeta()));
    }else
        list.add(new net.minecraft.item.ItemStack(itemIn, 1, 0));
    
}