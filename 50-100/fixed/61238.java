public void setupActionBar() {
    android.widget.ImageButton ib = ((android.widget.ImageButton) (getLayoutInflater().inflate(R.layout.title_main, null)));
    this.getSupportActionBar().setCustomView(ib, params);
    super.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    super.getSupportActionBar().setDisplayShowCustomEnabled(true);
}