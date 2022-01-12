@java.lang.Override
public void onOk() {
    if ((phoneConfirmationButton) == null) {
        return ;
    }
    com.waz.zclient.ui.utils.KeyboardUtils.showKeyboard(getActivity());
    phoneConfirmationButton.setState(PhoneConfirmationButton.State.INVALID);
}