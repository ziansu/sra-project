@java.lang.Override
public void read(dev.wolveringer.bungeeutil.packetlib.reader.PacketDataSerializer s) {
    this.location = s.readBlockPosition();
    for (int i = 0; i < 4; i++) {
        this.lines[i] = s.readString((-1));
    }
}