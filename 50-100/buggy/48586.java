@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    com.uchicago.yifan.meditreader.Model.User user = dataSnapshot.getValue(com.uchicago.yifan.meditreader.Model.User.class);
    if (user == null) {
        android.util.Log.e(com.uchicago.yifan.meditreader.Activities.CreatePost.CreatePostActivity.TAG, (("User " + userId) + " is unexpectedly null"));
        android.widget.Toast.makeText(this, "Error: could not fetch user.", Toast.LENGTH_SHORT).show();
    }else {
        writeNewPost(getUid(), user.username);
    }
    finish();
}