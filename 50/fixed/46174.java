public static boolean isMessageReceived(net.atomarea.flowx.entities.Message m) {
    if ((m.getType()) == (net.atomarea.flowx.entities.Message.TYPE_STATUS))
        return false;
    else
        if ((m.getStatus()) <= (net.atomarea.flowx.entities.Message.STATUS_RECEIVED))
            return true;
        
    
    return false;
}