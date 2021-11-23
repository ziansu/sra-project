@java.lang.Override
public void onCancel(android.view.View view, android.view.MotionEvent event) {
    com.heaven7.android.dragflowlayout.DragFlowLayout.sDebugger.i("onCancel", "------------->");
    releaseDragInternal(true);
}