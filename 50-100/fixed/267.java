@java.lang.Override
public void run() {
    do {
        network.packet.Packet packet = null;
        if ((sInput) != null)
            try {
                packet = getPacket();
            } catch (java.io.IOException e) {
                break;
            }
        
        if (packet == null)
            continue;
        
        if ((adapter) != null)
            adapter.parsePacket(NetworkTypes.CLIENT, packet);
        
    } while (true );
}