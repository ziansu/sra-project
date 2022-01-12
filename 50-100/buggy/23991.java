protected float parsePos(int index, double value) {
    if (handleValues)
        return ((float) ((chartView.horController.getAxisVerticalPosition()) - (((value - (minLabelValue)) * (screenStep)) / ((labelsValues.get(1)) - (minLabelValue)))));
    else
        return labelsPos.get(index);
    
}