@javax.persistence.Transient
public int getFinishedUserStories() {
    int finishedUserStories = 0;
    for (com.scrumiverse.model.scrumCore.UserStory us : userStories) {
        if ((us.getPlanState()) == (PlanState.Done))
            finishedUserStories++;
        
    }
    return finishedUserStories;
}