public void run() {
    mediaPlayerA.release();
    mediaPlayerA = null;
    android.widget.Toast.makeText(getApplicationContext(), "Release mediaPlayerA", Toast.LENGTH_LONG).show();
}