@java.lang.Override
public void onChildAdded(com.firebase.client.DataSnapshot dataSnapshot, java.lang.String s) {
    edu.rosehulman.roselabs.sharewithme.UserProfile user = dataSnapshot.getValue(edu.rosehulman.roselabs.sharewithme.UserProfile.class);
    mUser.setKey(dataSnapshot.getKey());
    mUser.setPicture(user.getPicture());
    mImageView.setImageBitmap(edu.rosehulman.roselabs.sharewithme.MainActivity.decodeStringToBitmap(mUser.getPicture()));
}