private void connected() {
    android.content.SharedPreferences.Editor editor = getPreferences(Context.MODE_PRIVATE).edit();
    editor.putString("Address", com.stuin.irs_scout.MainActivity.address);
    editor.apply();
    findViewById(R.id.AddressBar).setVisibility(View.GONE);
    findViewById(R.id.gridLayout).setVisibility(View.GONE);
    form = ((com.stuin.irs_scout.PageManager) (findViewById(R.id.Form)));
    form.start(this);
}