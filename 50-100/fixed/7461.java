private void updatePacketInWindow(int sequence, WebApplication.HTTPConnection.AcknowledgementCode code) {
    for (int i = Window_Position; (i < ((Window_Size) + (Window_Position))) && (i < ((Packet_Buffer.size()) - 1)); ++i) {
        if (sequence == ((Packet_Buffer.get(i).getSequenceNumber()) % (Sequence_Modulus))) {
            Packet_Buffer.get(i).updateAcknowledgementCode(code);
            break;
        }
    }
}