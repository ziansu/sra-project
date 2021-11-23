protected float parseYPos(double value) {
    return ((float) ((mChartView.horController.getAxisVerticalPosition()) - (((value - (minLabelValue)) * (mScreenStep)) / ((mLabels.get(1)) - (minLabelValue)))));
}