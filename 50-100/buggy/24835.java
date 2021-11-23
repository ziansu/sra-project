public synchronized com.microrisc.dpa22x.timing.TimingParams getTimingParams(short[] request) {
    com.microrisc.dpa22x.timing.TimingParamsStorage.logger.debug("getTimingParams - start: request={}", request);
    short perNum = com.microrisc.dpa22x.ProtocolProperties.getPeripheralNumber(request);
    com.microrisc.dpa22x.timing.TimingParamsStorage.MutableTimingParams mutTimingParams = timingParamsMap.get(perNum);
    if (mutTimingParams == null) {
        com.microrisc.dpa22x.timing.TimingParamsStorage.logger.warn("getTimingParams: not found timing params for peripheral {}", perNum);
        com.microrisc.dpa22x.timing.TimingParamsStorage.logger.debug("getTimingParams - end: null");
        return null;
    }
    com.microrisc.dpa22x.timing.TimingParamsStorage.logger.debug("getTimingParams - end: {}");
    return mutTimingParams.getTimingParams();
}