private void setup() {
    addTextChangedListener(mTextWatcher);
    setOnFocusChangeListener(mFocusListener);
    setOnKeyListener(new com.paymentkit.views.CVVEditText.ZanyKeyListener());
}