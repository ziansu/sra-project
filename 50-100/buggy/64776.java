public void requestResource() {
    try {
        if ((this.requestState) == (message.MessagePasser.RequestState.RELEASED)) {
            this.requestState = message.MessagePasser.RequestState.WANTED;
            message.GroupMessage groupMessage = new message.GroupMessage(localName, mainGroup, null, null, Message.MessageType.REQUEST);
            repliesCounter = new java.util.concurrent.CountDownLatch(((config.Configuration.getGroupSize(mainGroup)) - 1));
            multicast(groupMessage);
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}