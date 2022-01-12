@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent event) {
    if ((pickedObject) != (selectedObject)) {
        toggleSelection();
    }
    if ((pickedObject) == (selectedObject)) {
        edit();
        return true;
    }
    return false;
}