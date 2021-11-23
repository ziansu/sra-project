@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.KITKAT)
@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    android.util.Log.i("MakeMachine", ("resultCode: " + resultCode));
    switch (resultCode) {
        case 0 :
            android.util.Log.i("MakeMachine", "User cancelled");
            break;
        case -1 :
            try {
                onPhotoTaken();
                break;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
    }
}