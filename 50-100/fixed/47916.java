@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
    if ((motionEvent.getAction()) == (android.view.MotionEvent.ACTION_DOWN)) {
        android.content.ClipData data = android.content.ClipData.newPlainText("", "");
        android.view.View.DragShadowBuilder shadowBuilder = new android.view.View.DragShadowBuilder(view);
        view.startDrag(data, shadowBuilder, view, 0);
        return true;
    }else {
        return false;
    }
}