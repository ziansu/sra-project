private void sendRelease() {
    for (int j = 0; j < (requestSet.length); j++) {
        java.lang.System.out.println(((((("Proc" + (procID)) + " sends RELEASE message to proc") + (requestSet[j])) + " at time ") + (time)));
        Message release = new Message(new Timestamp(time, procID), messageType.RELEASE);
        sendMessage(requestSet[j], release);
    }
}