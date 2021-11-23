public void updateIgnore() {
    filteredBacklog.clear();
    synchronized(backlog) {
        for (com.iskrembilen.quasseldroid.protocol.state.IrcMessage msg : backlog) {
            msg.setFiltered(com.iskrembilen.quasseldroid.protocol.state.Client.getInstance().getIgnoreListManager().matches(msg));
            if (!(isMessageFiltered(msg))) {
                if ((getMarkerLineMessage()) == (msg.messageId))
                    isMarkerLineFiltered = false;
                
                filteredBacklog.add(msg);
            }else
                if ((getMarkerLineMessage()) == (msg.messageId))
                    isMarkerLineFiltered = true;
                
            
        }
    }
}