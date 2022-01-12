@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    switch (requestCode) {
        case com.pingstersapp.MainActivity.REQUEST_CHECK_SETTINGS :
            switch (resultCode) {
                case android.app.Activity.RESULT_OK :
                    android.util.Log.i(com.pingstersapp.MainActivity.TAG, "User agreed to make required location settings changes.");
                    break;
                case android.app.Activity.RESULT_CANCELED :
                    android.util.Log.i(com.pingstersapp.MainActivity.TAG, "User chose not to make required location settings changes.");
                    mRequestingLocationUpdates = false;
                    break;
            }
            break;
    }
}