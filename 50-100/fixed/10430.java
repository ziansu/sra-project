@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent intent) {
    super.onActivityResult(requestCode, resultCode, intent);
    if (requestCode == 1) {
        if (resultCode == (android.app.Activity.RESULT_OK)) {
            android.util.Log.i("addpost", "back button clicked 2");
            currentUser = intent.getParcelableExtra("user");
            currentUserToken = intent.getParcelableExtra("accessToken");
        }
    }
}