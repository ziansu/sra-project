public void close() throws java.io.IOException {
    flush();
    _writer.close();
    if (_countersSetup) {
        _recordRateCounter.close();
        _rowRateCounter.close();
    }
    if (_indexLocally) {
        if (_optimizeInFlight) {
            copyAndOptimizeInFlightDir();
        }else {
            copyDir();
        }
    }
    if (_countersSetup) {
        _copyRateCounter.close();
    }
}