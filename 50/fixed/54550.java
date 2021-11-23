@java.lang.Override
public void onOk() {
    if ((editTextPhone) == null) {
        return ;
    }
    com.waz.zclient.ui.utils.KeyboardUtils.showKeyboard(getActivity());
    editTextPhone.requestFocus();
    phoneConfirmationButton.setState(PhoneConfirmationButton.State.INVALID);
}