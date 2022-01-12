public void doActiveCoping(MentalState.Goal goal) {
    java.lang.System.out.println("COPING STRATEGY: Active Coping");
    if ((perception.getEmotionValence()) < 0) {
        action.acknowledgeEmotion(goal);
    }
    action.expressEmotion(goal);
    if (didHumanAsk(goal))
        respondToHuman(goal);
    
    if (isTaskDelegationPossible(goal)) {
        edu.wpi.cetask.Plan successorPlan = getDelegationSuccessor(goal.getPlan());
        discoActionsWrapper.proposeTaskWho(successorPlan, false, false);
        delegateTask(goal, false, true);
    }
}