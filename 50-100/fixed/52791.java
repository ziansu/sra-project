@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound tag) {
    if (tag.hasKey("panelType")) {
        panel = techreborn.blocks.generator.solarpanel.EnumPanelType.values()[tag.getInteger("panelType")];
    }else {
        Core.logHelper.warn(("A solar panel has failed to load from NBT, it will not work correctly. Please break and replace it to fix the issue. BlockPos:" + (pos.toString())));
        panel = techreborn.blocks.generator.solarpanel.EnumPanelType.Basic;
    }
    super.readFromNBT(tag);
}