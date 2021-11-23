@java.lang.Override
public void onSubmitRow() {
    int highlightPosition = model.getHighlightPosition();
    recall.RecallData recallData = model.getRecallData();
    recallData.submitRow(highlightPosition);
    if (recallData.allRowsSubmitted()) {
        grid.refresh();
        dispatchRecallCompleteEvent();
    }else {
        this.onNextRow();
    }
}