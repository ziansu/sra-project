public void Backfromsingle(android.view.View v) {
    android.widget.Toast.makeText(getApplicationContext(), "you click back", Toast.LENGTH_SHORT).show();
    com.bumptech.glide.Glide.get(this).clearMemory();
    finish();
}