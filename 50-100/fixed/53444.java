protected void addColSelection() {
    addRPMColSelection();
    addAFLearningColSelection();
    addAFCorrectionColSelection();
    addMAFVoltageColSelection();
    addWidebandAFRColSelection();
    addThrottleAngleColSelection();
    if (isPolfTableSet) {
        if (isPolfTableMap)
            addManifoldAbsolutePressureColSelection();
        else
            addLoadColSelection();
        
    }else {
        addCommandedAFRColSelection(isPolfTableSet);
    }
}