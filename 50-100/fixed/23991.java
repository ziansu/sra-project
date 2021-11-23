protected float parsePos(int index, double value) {
    if ((handleValues) && ((labelsValues.size()) > 1))
        return ((float) ((chartView.horController.getAxisVerticalPosition()) - (((value - (minLabelValue)) * (screenStep)) / ((labelsValues.get(1)) - (minLabelValue)))));
    else
        return (labelsPos.size()) > index ? labelsPos.get(index) : -1;
    
}