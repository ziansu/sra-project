public void updateKeyboardFromSettingsLocked() {
    mShowImeWithHardKeyboard = mSettings.isShowImeWithHardKeyboardEnabled();
    if ((((mSwitchingDialog) != null) && ((mSwitchingDialogTitleView) != null)) && (mSwitchingDialog.isShowing())) {
        final android.widget.Switch hardKeySwitch = ((android.widget.Switch) (mSwitchingDialogTitleView.findViewById(com.android.internal.R.id.hard_keyboard_switch)));
        hardKeySwitch.setChecked(mShowImeWithHardKeyboard);
    }
}