@java.lang.Override
protected void onPause() {
    mMessagesDatabaseReference.removeEventListener(mDeliveryChildEventListener);
    mMessagesDatabaseReferenceSecondName.removeEventListener(mChildEventListener);
    super.onPause();
    com.george.getreadychat.UserToUserMessageNotification.isActiveNotification = false;
}