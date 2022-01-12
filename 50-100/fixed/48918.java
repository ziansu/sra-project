@java.lang.Override
public void onClick(android.view.View v) {
    final java.lang.String message = mEdtStatus.getText().toString();
    try {
        com.soomla.profile.SoomlaProfile.getInstance().updateStatus(this, mProvider, message, gameReward);
    } catch (com.soomla.profile.exceptions.ProviderNotFoundException e) {
        e.printStackTrace();
    }
}