@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    mPinUnlockWizardFragmentViewModel.saveViewModelState(outState);
    outState.putCharSequence(org.sufficientlysecure.keychain.ui.keyunlock.wizard.PinUnlockWizardFragment.STATE_SAVE_STATUS_TEXT, mPinUnlockDialogStatus.getText());
    outState.putInt(org.sufficientlysecure.keychain.ui.keyunlock.wizard.PinUnlockWizardFragment.STATE_SAVE_CHECK_VISIBILITY, mCheckImageView.getVisibility());
    outState.putInt(org.sufficientlysecure.keychain.ui.keyunlock.wizard.PinUnlockWizardFragment.STATE_SAVE_WRONG_VISIBILITY, mWrongImageView.getVisibility());
    outState.putInt(org.sufficientlysecure.keychain.ui.keyunlock.wizard.PinUnlockWizardFragment.STATE_SAVE_STATUS_COLOR, mPinUnlockDialogStatus.getCurrentTextColor());
}