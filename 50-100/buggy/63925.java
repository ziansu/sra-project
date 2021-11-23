@java.lang.Override
public com.thevoxelbox.genesis.data.DataContainer read(java.io.InputStream stream) throws java.io.IOException {
    try (com.flowpowered.nbt.stream.NBTInputStream in = new com.flowpowered.nbt.stream.NBTInputStream(stream, false)) {
        com.flowpowered.nbt.CompoundTag tag = ((com.flowpowered.nbt.CompoundTag) (in.readTag()));
        com.thevoxelbox.genesis.data.DataContainer data = com.thevoxelbox.genesis.data.nbt.NbtTranslator.getInstance().translate(tag);
        return data;
    }
}