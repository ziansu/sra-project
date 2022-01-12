@java.lang.Override
public void onPacketFromServer(net.minecraft.network.PacketBuffer data) throws java.io.IOException {
    heat.T = data.readFloat();
    fuel = data.readFloat();
    burnRate = data.readFloat();
}