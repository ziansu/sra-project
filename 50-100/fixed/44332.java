@java.lang.Override
protected void onPause() {
    mMessagesDatabaseReference.child(UserDetails.usernameID).child(UserDetails.secondUser).child(UserDetails.secondUserID).removeEventListener(mDeliveryChildEventListener);
    mMessagesDatabaseReferenceSecondName.child(UserDetails.secondUserID).child(UserDetails.username).child(UserDetails.usernameID).removeEventListener(mChildEventListener);
    super.onPause();
    com.george.getreadychat.UserToUserMessage.isActive = false;
}