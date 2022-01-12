@java.lang.Override
public org.lanternpowered.server.network.message.Message decode(org.lanternpowered.server.network.message.codec.CodecContext context, org.lanternpowered.server.network.buffer.ByteBuffer buf) throws io.netty.handler.codec.CodecException {
    final int type = buf.readVarInt();
    if (type == 0) {
        final int id = buf.readInteger();
        return new org.lanternpowered.server.network.vanilla.message.type.play.MessagePlayInDisplayedRecipe(id);
    }else
        if (type == 1) {
            final boolean open = buf.readBoolean();
            final boolean filter = buf.readBoolean();
            return new org.lanternpowered.server.network.vanilla.message.type.play.MessagePlayInCraftingBookState(open, filter);
        }
    
    return org.lanternpowered.server.network.message.NullMessage.INSTANCE;
}