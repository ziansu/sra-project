@java.lang.Override
public void writeCustomNBT(net.minecraft.nbt.NBTTagCompound compound, boolean sync) {
    if (!(beams.isEmpty())) {
        net.minecraft.nbt.NBTTagList array = new net.minecraft.nbt.NBTTagList();
        for (com.teamwizardry.refraction.api.beam.Beam beam : beams)
            array.appendTag(beam.serializeNBT());
        
        compound.setTag("beams", array);
    }
}