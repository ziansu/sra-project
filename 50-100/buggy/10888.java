private void onUserReceived(com.pdrogfer.onstage.model.User user) {
    android.widget.Toast.makeText(this, ("user logged and retrieved: " + (user.toString())), Toast.LENGTH_SHORT).show();
    android.util.Log.i(com.pdrogfer.onstage.ui.PresentationActivity.TAG, ("onUserReceived: " + (user.toString())));
    com.pdrogfer.onstage.Utils.storeUserToSharedPrefs(user.getUid(), user.getName(), user.getEmail(), user.getUserType(), this);
    goToListActivity();
}