protected void addColSelection() {
    addRPMColSelection();
    if (isPolfTableMap)
        addManifoldAbsolutePressureColSelection();
    else
        addLoadColSelection();
    
    addAFLearningColSelection();
    addAFCorrectionColSelection();
    addMAFVoltageColSelection();
    addWidebandAFRColSelection();
    addThrottleAngleColSelection();
    if (!(isPolfTableMap))
        addCommandedAFRColSelection(isPolfTableSet);
    
}