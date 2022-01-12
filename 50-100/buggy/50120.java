@java.lang.Override
public void onSuccess(@javax.annotation.Nullable
final com.greenaddress.greenapi.LoginData result) {
    final android.content.SharedPreferences.Editor editor = getSharedPreferences("pin", com.greenaddress.greenbits.ui.MODE_PRIVATE).edit();
    editor.putInt("counter", 0);
    editor.apply();
    if ((getCallingActivity()) == null) {
        final android.content.Intent mainActivity = new android.content.Intent(this, com.greenaddress.greenbits.ui.TabbedMainActivity.class);
        startActivity(mainActivity);
    }else {
        setResult(com.greenaddress.greenbits.ui.RESULT_OK);
        finish();
    }
}