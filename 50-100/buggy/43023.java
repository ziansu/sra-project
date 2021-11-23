public static com.ctrip.zeus.support.AppHealthCheckDo toAppHealthCheckDo(com.ctrip.zeus.support.HealthCheck e) {
    return new com.ctrip.zeus.support.AppHealthCheckDo().setUri(e.getUri()).setIntervals(e.getIntervals()).setId(e.getIntervals()).setFails(e.getFails()).setPasses(e.getPasses());
}