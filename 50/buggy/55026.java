private static void writeNamedNBTTag(java.io.OutputStream out, nbt.NBTTag tag) throws java.io.IOException {
    writer.NBTWriter.writeString(out, tag.getName());
    writer.NBTWriter.writeNBTTag(out, tag);
}