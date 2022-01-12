public static nu.yona.server.analysis.entities.Activity createInstance(java.util.UUID userAnonymizedID, nu.yona.server.goals.entities.Goal goal, java.util.Date startTime) {
    return new nu.yona.server.analysis.entities.Activity(java.util.UUID.randomUUID(), userAnonymizedID, goal.getID(), startTime);
}