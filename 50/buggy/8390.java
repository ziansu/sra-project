@java.lang.Override
public void onAdapterAboutToEmpty(int itemsInAdapter) {
    android.widget.Toast.makeText(getApplicationContext(), "About to get empty!", Toast.LENGTH_SHORT).show();
}