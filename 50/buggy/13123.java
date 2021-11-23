@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.widget.Toast.makeText(context, "destroyed", Toast.LENGTH_SHORT).show();
}