@java.lang.Override
protected void onRestart() {
    super.onRestart();
    android.content.Intent intent = getIntent();
    intent.putExtra("currentView", viewPager.getCurrentItem());
    finish();
    startActivity(intent);
}