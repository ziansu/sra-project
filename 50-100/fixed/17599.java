@java.lang.Override
public net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound tag) {
    this.tank.writeToNBT(tag);
    tag.setBoolean("working", this.working);
    tag.setInteger("process", this.process);
    tag.setInteger("processMax", this.processMax);
    if ((recipe) != null) {
        net.minecraft.nbt.NBTTagCompound item = recipe.getInput().writeToNBT(new net.minecraft.nbt.NBTTagCompound());
        tag.setTag("recipeInput", item);
    }
    return super.writeToNBT(tag);
}