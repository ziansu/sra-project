@java.lang.Override
public void foregroundCallback(java.lang.String result) {
    if (result != null) {
        android.util.Log.d(tag, result);
        if (!(uId.equals("false"))) {
            ApplicationClass.surveyor_Id = java.lang.Integer.parseInt(uId);
            android.content.Intent i = new android.content.Intent(this, anipr.transtech.android.MainActivity.class);
            startActivity(i);
            finish();
        }else {
            android.widget.Toast.makeText(getApplicationContext(), "Please try again.", Toast.LENGTH_LONG).show();
        }
    }
}