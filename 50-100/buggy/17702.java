public com.builtbroken.mc.core.network.packet.PacketTile getDescPacket() {
    com.builtbroken.mc.imp.transform.vector.Pos pos = ((getHost()) != null) ? new com.builtbroken.mc.imp.transform.vector.Pos(((net.minecraft.tileentity.TileEntity) (getHost()))) : new com.builtbroken.mc.imp.transform.vector.Pos();
    if ((overrideRenderBounds) != null) {
        return new com.builtbroken.mc.core.network.packet.PacketTile(this, 1, pos, shouldRenderBlock, true, overrideRenderBounds);
    }else {
        return new com.builtbroken.mc.core.network.packet.PacketTile(this, 1, pos, shouldRenderBlock, false);
    }
}