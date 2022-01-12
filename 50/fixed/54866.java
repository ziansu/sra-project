@java.lang.Override
public android.view.View onCreateInputView() {
    keyboardView = ((android.inputmethodservice.KeyboardView) (getLayoutInflater().inflate(R.layout.keyboard, null)));
    keyboardView.setOnKeyboardActionListener(this);
    return keyboardView;
}