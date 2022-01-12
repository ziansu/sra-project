@java.lang.Override
public void writeToNBT(net.minecraft.nbt.NBTTagCompound tag) {
    super.writeToNBT(tag);
    this.tank.writeToNBT(tag);
    tag.setBoolean("working", this.working);
    tag.setInteger("process", this.process);
    tag.setInteger("processMax", this.processMax);
    if ((recipe) != null) {
        net.minecraft.nbt.NBTTagCompound item = recipe.getInput().writeToNBT(new net.minecraft.nbt.NBTTagCompound());
        tag.setTag("recipeInput", item);
    }
}