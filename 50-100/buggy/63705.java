@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_DOWN)) {
        isClicked = true;
        mIsRenameFirst = false;
        if (((isRename) == false) || ((getLastClickPos()) != (getAdapterPosition()))) {
            ctrlProcess(v, event);
        }
    }
    return false;
}