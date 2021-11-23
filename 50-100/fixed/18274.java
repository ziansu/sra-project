@java.lang.Override
public void safeRun() {
    int gravity = text.getGravity();
    if (useRtlAlign) {
        text.setGravity((gravity | (android.view.Gravity.RELATIVE_LAYOUT_DIRECTION)));
    }else {
        text.setGravity((gravity & (~(android.view.Gravity.RELATIVE_LAYOUT_DIRECTION))));
    }
}