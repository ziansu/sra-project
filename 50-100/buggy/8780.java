@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
    switch (event.getActionMasked()) {
        case android.view.MotionEvent.ACTION_DOWN :
            android.view.View.DragShadowBuilder shadowBuilder = new android.view.View.DragShadowBuilder();
            view.startDrag(android.content.ClipData.newPlainText("", ""), shadowBuilder, view, 0);
            return true;
        default :
            return false;
    }
}