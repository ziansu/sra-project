public void doActiveCoping(MentalState.Goal goal) {
    java.lang.System.out.println("COPING STRATEGY: Active Coping");
    if ((perception.getEmotionValence()) < 0) {
        action.acknowledgeEmotion(goal);
    }
    if (didHumanAsk(goal))
        respondToHuman(goal);
    
    if (isTaskDelegationPossible(goal)) {
        delegateTask(goal, false, true);
    }
}