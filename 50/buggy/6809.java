public void setMonthData(sun.bob.simcal.model.mMonthData data) {
    currentCCYY = data.getYear();
    currentMM = data.getMonth();
    currentDD = data.getCenterDay();
}