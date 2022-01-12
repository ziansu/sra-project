@java.lang.Override
public void onClick(android.view.View v) {
    final java.lang.String message = mEdtStatus.getText().toString();
    com.soomla.blueprint.rewards.Reward gameReward = new com.soomla.blueprint.rewards.VirtualItemReward("blabla", "Update Status for VG", mItemAmount, mItemId);
    try {
        com.soomla.profile.SoomlaProfile.getInstance().getSocialController().updateStatus(mProvider, message, gameReward);
    } catch (com.soomla.profile.exceptions.ProviderNotFoundException e) {
        e.printStackTrace();
    }
}