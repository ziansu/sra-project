@java.lang.Override
public void safeRun() {
    if (isPassword) {
        text.setInputType(((android.view.inputmethod.EditorInfo.TYPE_CLASS_TEXT) | (android.view.inputmethod.EditorInfo.TYPE_TEXT_VARIATION_PASSWORD)));
    }else {
        text.setInputType(((text.getInputType()) & (~(android.view.inputmethod.EditorInfo.TYPE_TEXT_VARIATION_PASSWORD))));
    }
}