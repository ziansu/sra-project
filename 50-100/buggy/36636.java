private double getAvailableInputRatio(MentalState.Goal eventGoal) {
    double dblAvailableInputCounter = 0.0;
    for (edu.wpi.cetask.TaskClass.Input input : collaboration.getInputs(eventGoal)) {
        if (input != null)
            if (collaboration.isInputAvailable(eventGoal, input))
                dblAvailableInputCounter++;
            
        
    }
    return ((double) (dblAvailableInputCounter)) / ((collaboration.getInputs(eventGoal).size()) == 0 ? 1 : collaboration.getInputs(eventGoal).size());
}