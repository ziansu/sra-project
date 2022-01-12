@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    java.util.Map<java.lang.String, java.lang.Object> hopperValues = ((java.util.Map<java.lang.String, java.lang.Object>) (dataSnapshot.getValue()));
    android.util.Log.d("Values", dataSnapshot.getValue().toString());
    bluefirelabs.mojo.main.ui.user.Gifts.RESTAURANT = ("uid/" + (UID)) + "/gifts";
    android.util.Log.d("Restaurant", bluefirelabs.mojo.main.ui.user.Gifts.RESTAURANT);
    myCallback.callbackCall(bluefirelabs.mojo.main.ui.user.Gifts.RESTAURANT);
}