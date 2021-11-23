@java.lang.Override
public com.builtbroken.mc.core.network.packet.PacketTile getGUIPacket() {
    return new com.builtbroken.mc.core.network.packet.PacketTile(this, 4, this.getEnergyStored(ForgeDirection.UNKNOWN), this.getTarget().xi(), this.getTarget().yi(), this.getTarget().zi(), (((laucherBase) != null) && ((laucherBase.getStackInSlot(0)) != null)));
}