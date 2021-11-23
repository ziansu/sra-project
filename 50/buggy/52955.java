public void updateDrawingModel() {
    if (shouldUpdateDrawingModel) {
        shouldUpdateDrawingModel = false;
    }else {
        return ;
    }
    drawingModel.updateCurrentCircuit(mainFrame.chart, mainFrame.chart.trunkCircuit, this);
    drawingModel.updateUpDownTrainOption(showUpDownState);
    drawingModel.setActiveTrain(activeTrain);
}