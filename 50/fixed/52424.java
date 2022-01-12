private void updateAllSteps() {
    for (int index = 0; index < (accels.size()); index++)
        updateStep(accels.get(index));
    
    accels.clear();
}