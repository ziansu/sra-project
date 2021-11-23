public int doBrokerTime(final double[] pTimeUTC) {
    com.jforex.dzjforex.ZorroBridge.logger.info("doBrokerTime called");
    return timeHandler.brokerTime(pTimeUTC);
}