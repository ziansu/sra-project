@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.i(com.polito.mad17.madmax.activities.ProfileEdit.TAG, "save clicked");
    if (updateAccount()) {
        android.widget.Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
        android.content.Intent i = new android.content.Intent(getApplicationContext(), com.polito.mad17.madmax.activities.MainActivity.class);
        startActivity(i);
        finish();
    }
}