public static boolean isMessageReceived(net.atomarea.flowx.entities.Message m) {
    return ((m.getType()) != (net.atomarea.flowx.entities.Message.TYPE_STATUS)) && ((m.getStatus()) <= (net.atomarea.flowx.entities.Message.STATUS_RECEIVED));
}