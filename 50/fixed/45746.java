@java.lang.Override
public void noButtonOperation() {
    confirmFieldsDisabled = true;
    changeConfirmFieldsVisibility(false);
    sendCodeButton.setVisibility(View.VISIBLE);
    this.cancelButtonOperation();
}