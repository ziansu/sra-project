@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    android.widget.Toast.makeText(getBaseContext(), "Press once again to exit!", Toast.LENGTH_SHORT).show();
}