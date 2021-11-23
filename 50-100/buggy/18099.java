public void start() {
    if (_logger.isInfoEnabled()) {
        _logger.info(java.lang.String.format("Starting %d message AO Stream at %d messages/second, reporting after %d messages\r\n", _aoNum, _aoRate, _reportInterval));
    }
    if ((_rate) > 1000) {
        _timer.schedule(this, 1);
    }else {
        _timer.scheduleAtFixedRate(this, 0, _rate);
    }
    _startTimestamp = java.lang.System.currentTimeMillis();
    _timestamp = _startTimestamp;
}