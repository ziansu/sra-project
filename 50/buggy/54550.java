@java.lang.Override
public void onOk() {
    com.waz.zclient.ui.utils.KeyboardUtils.showKeyboard(getActivity());
    editTextPhone.requestFocus();
    phoneConfirmationButton.setState(PhoneConfirmationButton.State.INVALID);
}