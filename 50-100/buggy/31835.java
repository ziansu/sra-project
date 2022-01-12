public boolean onReadUnready() {
    boolean result = false;
    boolean interested = false;
    try (org.eclipse.jetty.util.thread.Locker.Lock lock = _locker.lock()) {
        if ((_asyncRead) != (org.eclipse.jetty.server.HttpChannelState.Interest.REGISTERED)) {
            _asyncReadPossible = false;
            if ((_state) == (org.eclipse.jetty.server.HttpChannelState.State.ASYNC_WAIT)) {
                result = interested = true;
                _asyncRead = org.eclipse.jetty.server.HttpChannelState.Interest.REGISTERED;
            }else {
                result = true;
                _asyncRead = org.eclipse.jetty.server.HttpChannelState.Interest.NEEDED;
            }
        }
    }
    if (interested)
        _channel.asyncReadInterested();
    
    return result;
}