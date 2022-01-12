@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
public void updateProgressBar(int index, int value) {
    switch (index) {
        case 0 :
            this.termoFluidFurnace.smeltingTicks = value;
            break;
        case 1 :
            this.termoFluidFurnace.totalSmeltingTicks = value;
            break;
        case 2 :
            this.termoFluidFurnace.internalTemp = value;
            break;
    }
}