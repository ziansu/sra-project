public byte[] toByteArray() {
    java.nio.ByteBuffer bb = java.nio.ByteBuffer.allocate(TicketManagerOncard.TICKET_SIZE);
    bb.putShort(mStartValidityTS);
    bb.put(mDuration);
    bb.put(((byte) ((mDurationUnit.ordinal()) & 255)));
    bb.put(mDescription.getBytes(clientAPI.data.Ticket.DEFAULT_CHARSET));
    while (bb.hasRemaining()) {
        bb.putChar(' ');
    } 
    return bb.array();
}