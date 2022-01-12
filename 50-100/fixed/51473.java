@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    myUser = dataSnapshot.getValue(com.fakhouri.salim.quest.User.class);
    java.lang.String sImage = myUser.getUserImage();
    android.graphics.Bitmap bitmap = myUser.stringToBitmap(sImage);
    headerImage.setImageBitmap(bitmap);
    headerText.setText(myUser.getUsername());
}