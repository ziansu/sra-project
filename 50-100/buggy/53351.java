private java.lang.Object createNbtTag(com.comphenix.attributes.NbtFactory.NbtType type, java.lang.String name, java.lang.Object value) {
    java.lang.Object tag = com.comphenix.attributes.NbtFactory.invokeMethod(NBT_CREATE_TAG, null, ((byte) (type.id)), name);
    if (value != null) {
        com.comphenix.attributes.NbtFactory.setFieldValue(getDataField(type, tag), tag, value);
    }
    return tag;
}