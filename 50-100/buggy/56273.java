@java.lang.Override
public java.lang.String lastPosition() throws net.sf.jabb.dstream.ex.DataStreamInfrastructureException {
    try {
        java.lang.String firstPositionAfterNow = firstPosition(java.time.Instant.now(), java.time.Duration.ofMillis(1));
        if (firstPositionAfterNow == null) {
            return java.lang.String.valueOf(lastEventTime.toEpochMilli());
        }else {
            return java.lang.String.valueOf(((java.lang.Long.valueOf(firstPositionAfterNow)) - (intervalMillis)));
        }
    } catch (java.lang.InterruptedException e) {
        new net.sf.jabb.dstream.ex.DataStreamInfrastructureException(e);
    }
    return null;
}