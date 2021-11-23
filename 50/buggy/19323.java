public void cancel(android.view.View view) {
    android.widget.Toast.makeText(getBaseContext(), "Cancel pressed! No changes made to the alarm. ", Toast.LENGTH_LONG).show();
    finish();
}