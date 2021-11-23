@java.lang.Override
public void noButtonOperation() {
    confirmFieldsDisabled = true;
    changeConfirmFieldsVisibility(true);
    sendCodeButton.setVisibility(View.VISIBLE);
    this.cancelButtonOperation();
}