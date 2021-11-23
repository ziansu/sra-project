@java.lang.Override
public void safeRun() {
    com.dava.framework.JNITextField.TextField text = com.dava.framework.JNITextField.GetTextField(id);
    int gravity = text.getGravity();
    if (useRtlAlign) {
        text.setGravity((gravity | (android.view.Gravity.RELATIVE_LAYOUT_DIRECTION)));
    }else {
        text.setGravity((gravity & (~(android.view.Gravity.RELATIVE_LAYOUT_DIRECTION))));
    }
    text.updateStaticTexture();
}