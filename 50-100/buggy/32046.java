@java.lang.Override
public boolean onTouch(final android.view.View v, android.view.MotionEvent event) {
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_UP)) {
        final boolean focus = line.isFocus();
        check(position);
        if ((!focus) || (!(holder.etLine.isFocused()))) {
            holder.etLine.requestFocus();
            holder.etLine.onWindowFocusChanged(true);
        }
    }
    return false;
}