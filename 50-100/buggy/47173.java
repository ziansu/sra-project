@java.lang.Override
public void deleteSchedule(co.cask.cdap.proto.Id.Program programId, co.cask.cdap.api.schedule.SchedulableProgramType programType, java.lang.String scheduleName) {
    co.cask.cdap.internal.app.runtime.schedule.StreamSizeScheduler.StreamSubscriber subscriber = scheduleSubscribers.remove(getScheduleId(programId, programType, scheduleName));
    if (subscriber != null) {
        synchronized(this) {
            subscriber.deleteSchedule(programId, programType, scheduleName);
            if (subscriber.isEmpty()) {
                subscriber.cancel();
                co.cask.cdap.proto.Id.Stream streamId = subscriber.getStreamId();
                streamSubscribers.remove(streamId);
            }
        }
    }
}