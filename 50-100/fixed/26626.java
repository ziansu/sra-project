private void loadNetwork(net.minecraft.nbt.NBTTagCompound tag) {
    net.minecraft.nbt.NBTTagList list = ((net.minecraft.nbt.NBTTagList) (tag.getTag("networks")));
    for (int i = 0; i < (list.tagCount()); ++i) {
        net.minecraft.nbt.NBTTagCompound tag2 = list.getCompoundTagAt(i);
        cn.academy.energy.internal.WirelessNet net = new cn.academy.energy.internal.WirelessNet(this, tag2);
        doAddNetwork(net);
    }
}