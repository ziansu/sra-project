@java.lang.Override
public void onUnLiked(com.example.user.cloudplayer.model.Like like) {
    if (like == null) {
        android.widget.Toast.makeText(getApplicationContext(), getResources().getString(R.string.unlike_alert), Toast.LENGTH_SHORT).show();
    }
}