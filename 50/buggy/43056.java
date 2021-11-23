@java.lang.Override
public void run() {
    timeStampsBuffer.add(com.github.rinde.rinsim.core.model.time.RealtimeModel.Realtime.TimeStamp.now());
    checkConsistency(false);
    context.tickImpl();
    if ((nextTrigger) != null) {
        cancelTask();
    }
}