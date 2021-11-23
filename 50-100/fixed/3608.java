@java.lang.Override
public void onViewPositionChanged(android.view.View changedView, int left, int top, int dx, int dy) {
    if (draggableView.isDragViewAtBottom()) {
        draggableView.changeDragViewViewAlpha();
    }else {
        draggableView.restoreAlpha();
        draggableView.changeDragViewScale();
        draggableView.changeDragViewPosition();
        draggableView.changeSecondViewAlpha();
        draggableView.changeSecondViewPosition();
        draggableView.changeBackgroundAlpha();
    }
}