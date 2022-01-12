@java.lang.Override
public void safeRun() {
    final com.dava.framework.JNITextField.TextField text = com.dava.framework.JNITextField.GetTextField(id);
    if (isPassword) {
        text.setInputType(((android.view.inputmethod.EditorInfo.TYPE_CLASS_TEXT) | (android.view.inputmethod.EditorInfo.TYPE_TEXT_VARIATION_PASSWORD)));
    }else {
        text.setInputType(((text.getInputType()) & (~(android.view.inputmethod.EditorInfo.TYPE_TEXT_VARIATION_PASSWORD))));
    }
    text.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            text.updateStaticTexture();
        }
    });
}