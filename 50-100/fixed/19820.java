@java.lang.Override
public void readBuf(io.netty.buffer.ByteBuf buffer) {
    int pointsLen = buffer.readUnsignedShort();
    if (pointsLen > 0) {
        points = new chat.onmap.app.Netty.Protokol.Packs2Client.MapPoint[pointsLen];
        for (int i = 0; i < pointsLen; i++) {
            points[i] = ((chat.onmap.app.Netty.Protokol.Packs2Client.MapPoint) (chat.onmap.app.Netty.Protokol.PacketFactory.produceFromBuf(PacketFactory.MAP_POINT, buffer)));
        }
    }else {
        points = new chat.onmap.app.Netty.Protokol.Packs2Client.MapPoint[0];
    }
}