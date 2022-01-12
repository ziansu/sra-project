@java.lang.Override
public boolean isReallyWorking() {
    return (needsBackgroundWork()) && (!(org.andstatus.app.util.RelativeTime.wasButMoreSecondsAgoThan(previousBeat, ((org.andstatus.app.service.MyService.HeartBeat.HEARTBEAT_PERIOD_SECONDS) + 3))));
}