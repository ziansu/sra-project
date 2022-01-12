public void toggleEventInvite(android.view.View view) {
    int id = view.getId();
    android.widget.CheckBox chkFriend = ((android.widget.CheckBox) (view));
    if (chkFriend.isChecked()) {
        android.util.Log.d(com.sarahrobinson.finalyearproject.activities.MainActivity.TAG, "Added to invite list");
    }else {
        android.util.Log.d(com.sarahrobinson.finalyearproject.activities.MainActivity.TAG, "Removed from invite list");
    }
}