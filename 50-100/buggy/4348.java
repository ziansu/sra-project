private void sendGrant(int sendId) {
    java.lang.System.out.println(((((("Proc" + (procID)) + " sends GRANT message to proc") + sendId) + " at time ") + (time)));
    granted = true;
    Message grantMessage = new Message(new Timestamp(time, procID), messageType.GRANT);
    sendMessage(sendId, grantMessage);
}