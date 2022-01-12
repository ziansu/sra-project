private void setup() {
    addTextChangedListener(mTextWatcher);
    setOnKeyListener(new com.paymentkit.views.CVVEditText.ZanyKeyListener());
}