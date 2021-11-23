public org.piwik.sdk.Tracker trackGoal(java.lang.Integer idGoal) {
    if ((idGoal == null) || (idGoal < 0))
        return this;
    
    return track(new org.piwik.sdk.TrackMe().set(QueryParams.GOAL_ID, idGoal));
}