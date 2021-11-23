public static riskyken.armourersWorkshop.common.library.LibraryFile readFromByteBuf(io.netty.buffer.ByteBuf buf) {
    java.lang.String fileName = cpw.mods.fml.common.network.ByteBufUtils.readUTF8String(buf);
    java.lang.String filePath = cpw.mods.fml.common.network.ByteBufUtils.readUTF8String(buf);
    java.lang.String regName = cpw.mods.fml.common.network.ByteBufUtils.readUTF8String(buf);
    riskyken.armourersWorkshop.api.common.skin.type.ISkinType skinType = SkinTypeRegistry.INSTANCE.getSkinTypeFromRegistryName(regName);
    boolean directory = buf.readBoolean();
    return new riskyken.armourersWorkshop.common.library.LibraryFile(fileName, filePath, skinType, directory);
}