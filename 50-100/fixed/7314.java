@java.lang.Override
public void done(com.parse.ParseUser user, com.parse.ParseException e) {
    if (e != null) {
        android.util.Log.e(com.codepath.timeline.network.TimelineClient.TAG, ((("Exception from getUser(" + userObjectId) + "): ") + (e.getMessage())));
        return ;
    }
    if (user != null) {
        android.util.Log.d(com.codepath.timeline.network.TimelineClient.TAG, "Success getUser");
        if (listener != null) {
            listener.onGetUser(user);
        }
    }
}