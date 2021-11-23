protected float parseYPos(double value) {
    return ((float) ((mChartView.horController.getAxisVerticalPosition()) - (((value + (java.lang.Math.abs(minLabelValue))) * (mScreenStep)) / ((mLabels.get(1)) + (java.lang.Math.abs(minLabelValue))))));
}