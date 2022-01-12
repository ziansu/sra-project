private void sendRelinquish(int sendId) {
    java.lang.System.out.println(((((("Proc" + (procID)) + " sends RELINQUISH message to proc") + sendId) + " at time ") + (time)));
    Message reqMessage = new Message(new Timestamp(time, procID), messageType.RELINQUISH);
    sendMessage(sendId, reqMessage);
}