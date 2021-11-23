public void handleEvent(org.eclipse.swt.widgets.Event event) {
    if ((selectedStage) != null) {
        stageModelWrapped.moveStageUp(selectedStage, currentSelectedDate);
        updateStageList();
    }
}