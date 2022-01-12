private void doRequest() {
    _lastRequest = _get.request();
    synchronized(_parserLock) {
        if ((_lastRequest) != null)
            _inpeParser = new xml.INPEXMLParser(_lastRequest);
        
    }
}