@java.lang.Override
public void validate() {
    if (((zones) == null) || ((zones.size()) == 0)) {
        throw nu.yona.server.goals.service.GoalServiceException.timeZoneGoalAtLeastOneZoneRequired();
    }
    for (java.lang.String zone : zones) {
        validateZone(zone);
    }
}