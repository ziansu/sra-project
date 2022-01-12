public void onReadUnready() {
    boolean interested = false;
    try (org.eclipse.jetty.util.thread.Locker.Lock lock = _locker.lock()) {
        if ((_asyncRead) != (org.eclipse.jetty.server.HttpChannelState.Interest.REGISTERED)) {
            _asyncReadPossible = false;
            if ((_state) == (org.eclipse.jetty.server.HttpChannelState.State.ASYNC_WAIT)) {
                interested = true;
                _asyncRead = org.eclipse.jetty.server.HttpChannelState.Interest.REGISTERED;
            }else
                _asyncRead = org.eclipse.jetty.server.HttpChannelState.Interest.NEEDED;
            
        }
    }
    if (interested)
        _channel.asyncReadInterested();
    
}