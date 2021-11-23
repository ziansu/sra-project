@java.lang.Override
public void onAuthenticationHelp(int helpCode, java.lang.CharSequence helpString) {
    android.widget.Toast.makeText(this, "请重刷指纹", Toast.LENGTH_SHORT).show();
}