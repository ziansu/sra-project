@java.lang.Override
public void onOk() {
    com.waz.zclient.ui.utils.KeyboardUtils.showKeyboard(getActivity());
    phoneConfirmationButton.setState(PhoneConfirmationButton.State.INVALID);
}