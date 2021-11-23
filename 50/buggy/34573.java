@javax.persistence.Transient
public int getCompletedEffort() {
    int completedEffort = 0;
    for (com.scrumiverse.model.scrumCore.UserStory us : userStories) {
        if ((us.getPlanState()) == (PlanState.Done));
        completedEffort = +(us.getEffortValue());
    }
    return completedEffort;
}