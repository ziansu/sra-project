@java.lang.Override
public java.lang.String setFrequency(java.lang.String string, int freq, java.lang.String name) {
    if (string != (cofh.core.RegistryEnderAttuned.dummy)) {
        cofh.core.network.PacketHandler.sendToServer(new cofh.core.RegistryEnderAttuned.Packet(hostedChannel, freq, name));
    }
    return super.setFrequency(hostedChannel, freq, name);
}