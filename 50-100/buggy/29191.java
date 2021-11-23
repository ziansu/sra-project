@java.lang.Override
public void safeRun() {
    final com.dava.framework.JNITextField.TextField text = com.dava.framework.JNITextField.GetTextField(id);
    text.setTextColor(android.graphics.Color.argb(((int) (255 * a)), ((int) (255 * r)), ((int) (255 * g)), ((int) (255 * b))));
    text.updateStaticTexture();
}