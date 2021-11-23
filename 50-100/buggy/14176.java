@java.lang.Override
void serialize(java.nio.ByteBuffer buffer) {
    buffer.put(heronarts.lx.osc.OscBundle.BUNDLE_HEADER);
    buffer.putLong(this.timeTag);
    for (heronarts.lx.osc.OscPacket packet : this.elements) {
        int sizePosition = buffer.position();
        buffer.position((sizePosition + 4));
        packet.serialize(buffer);
        buffer.putInt(sizePosition, (((buffer.position()) - sizePosition) + 4));
    }
}