@java.lang.Override
public boolean isGoalChanged(nu.yona.server.goals.entities.Goal existingGoal) {
    return !(zones.equals(((nu.yona.server.goals.entities.TimeZoneGoal) (existingGoal)).getZones()));
}