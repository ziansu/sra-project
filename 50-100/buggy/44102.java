@java.lang.Override
public void onHeaderClick(apps.amine.bou.readerforselfoss.settings.Header header, int position) {
    super.onHeaderClick(header, position);
    if ((header.id) == (R.id.theme_change)) {
        getBaseContext().startActivity(com.ftinc.scoop.ui.ScoopSettingsActivity.createIntent(getApplicationContext()));
        finish();
    }
}