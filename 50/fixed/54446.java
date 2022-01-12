@java.lang.Override
public void onComplete(com.google.firebase.database.DatabaseError databaseError, com.google.firebase.database.DatabaseReference databaseReference) {
    if (databaseError != null) {
        callbackContext.sendPluginResult(convertToPluginResult(databaseError, false));
    }else {
        callbackContext.sendPluginResult(new org.apache.cordova.PluginResult(PluginResult.Status.OK, path));
    }
}