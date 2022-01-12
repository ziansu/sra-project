private void checkIdleStatus() {
    if ((lastState.getType()) != (com.codealike.client.core.internal.dto.ActivityType.Idle)) {
        org.joda.time.DateTime now = org.joda.time.DateTime.now();
        org.joda.time.Duration duration = new org.joda.time.Duration(lastEvent.getCreationTime(), now);
        if ((duration.compareTo(idleMinInterval)) < 0) {
            lastState = recorder.recordState(com.codealike.client.core.internal.tracking.ActivityState.createIdleState(PluginContext.UNASSIGNED_PROJECT));
        }
    }
}