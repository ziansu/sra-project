public MentalState.Goal getTopLevelGoal() {
    if (MentalState.MentalState.getInstance().getGoals().isEmpty())
        java.lang.System.out.println("ERROR: No top level goal is available.");
    else {
        return MentalState.MentalState.getInstance().getGoals().get(0);
    }
    return null;
}