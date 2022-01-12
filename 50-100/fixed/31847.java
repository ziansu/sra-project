@java.lang.Override
public void onComplete(com.google.firebase.database.DatabaseError error, com.google.firebase.database.DatabaseReference reference) {
    if (error != null) {
        android.widget.Toast.makeText(getApplicationContext(), "Unable to save change, try again later!", Toast.LENGTH_LONG).show();
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "Delivery area saved!", Toast.LENGTH_LONG).show();
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.gmail.dleemcewen.tandemfieri.Events.ActivityEvent(ActivityEvent.Result.REFRESH_RESTAURANT_LIST));
    }
}