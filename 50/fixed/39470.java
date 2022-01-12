@java.lang.Override
public cpw.mods.fml.common.network.simpleimpl.IMessage onMessage(com.kihira.corruption.common.network.DiaryEntriesMessage message, cpw.mods.fml.common.network.simpleimpl.MessageContext ctx) {
    if ((message.tagCompound) != null)
        com.kihira.corruption.common.CorruptionDataHelper.setPageData(message.tagCompound.getTagList("PageData", 8), net.minecraft.client.Minecraft.getMinecraft().thePlayer);
    
    return null;
}