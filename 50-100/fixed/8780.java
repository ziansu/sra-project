@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
    switch (event.getActionMasked()) {
        case android.view.MotionEvent.ACTION_DOWN :
            view.startDrag(android.content.ClipData.newPlainText("", ""), new android.view.View.DragShadowBuilder(), view, 0);
            return true;
        default :
            return false;
    }
}