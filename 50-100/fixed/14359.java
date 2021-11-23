@java.lang.Override
public void fromBytes(io.netty.buffer.ByteBuf buf) {
    java.lang.String dataJson = cpw.mods.fml.common.network.ByteBufUtils.readUTF8String(buf);
    try {
        entries = Tails.gson.fromJson(dataJson, new com.google.gson.reflect.TypeToken<java.util.List<kihira.tails.common.LibraryEntryData>>() {        }.getType());
    } catch (com.google.gson.JsonParseException e) {
        e.printStackTrace();
    }
    delete = buf.readBoolean();
}