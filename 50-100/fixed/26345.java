@java.lang.Override
public void onMessage(org.hornetq.api.core.client.ClientMessage msg) {
    org.yamcs.protobuf.Yamcs.TmPacketData data;
    try {
        data = ((org.yamcs.protobuf.Yamcs.TmPacketData) (org.yamcs.api.Protocol.decode(msg, org.yamcs.protobuf.Yamcs.TmPacketData.newBuilder())));
        packetsTable.packetReceived(data);
    } catch (org.yamcs.api.YamcsApiException e) {
        log(e.toString());
        e.printStackTrace();
    }
}