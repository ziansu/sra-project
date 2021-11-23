public void sendQueryAbortion(int queryID) {
    java.nio.ByteBuffer message = java.nio.ByteBuffer.allocate(((java.lang.Byte.BYTES) + (java.lang.Integer.BYTES)));
    message.put(MessageType.QUERY_ABORTION.getValue()).putInt(queryID);
    messageSender.sendToAllSlaves(message.array());
}