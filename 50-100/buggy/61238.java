public void setupActionBar() {
    android.widget.ImageButton ib = ((android.widget.ImageButton) (getLayoutInflater().inflate(R.layout.title_main, null)));
    android.support.v7.app.ActionBar.LayoutParams params = new android.support.v7.app.ActionBar.LayoutParams(android.view.Gravity.CENTER);
    this.getSupportActionBar().setCustomView(ib, params);
    super.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    super.getSupportActionBar().setDisplayShowCustomEnabled(true);
}