@java.lang.Override
protected void onStop() {
    if ((mChildEventListener) != null) {
        mMessagesDatabaseReference.child(UserDetails.usernameID).child(UserDetails.secondUser).child(UserDetails.secondUserID).removeEventListener(mDeliveryChildEventListener);
        mMessagesDatabaseReferenceSecondName.child(UserDetails.secondUserID).child(UserDetails.username).child(UserDetails.usernameID).removeEventListener(mChildEventListener);
    }
    super.onStop();
    com.george.getreadychat.UserToUserMessage.isActive = false;
    android.widget.Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
}