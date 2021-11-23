public void kleinesUpdate() {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.hvs.UpdateActivity.class);
    intent.putExtra("liga", ligaNr);
    intent.putExtra("update", 1);
    intent.putExtra("liganame", this.getTitle());
    this.finish();
    startActivity(intent);
}