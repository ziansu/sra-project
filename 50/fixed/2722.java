@java.lang.Override
public void onAuthenticationHelp(int helpCode, java.lang.CharSequence helpString) {
    android.widget.Toast.makeText(this, helpString, Toast.LENGTH_SHORT).show();
}