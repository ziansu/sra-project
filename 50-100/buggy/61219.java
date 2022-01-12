public MentalState.Goal getTopLevelGoal() {
    if (MentalState.MentalState.getInstance().getGoals().isEmpty())
        java.lang.System.out.println("ERROR: No top level goal is available.");
    else {
        for (MentalState.Goal goal : MentalState.MentalState.getInstance().getGoals()) {
            if (goal.getPlan().getType().equals(disco.getTop(disco.getFocus()).getType()))
                return goal;
            
        }
    }
    return null;
}