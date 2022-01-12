@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.menu_setting :
            android.content.Intent intent = new android.content.Intent(this, com.paranoid.mao.bbclearningenglish.settings.SettingActivity.class);
            startActivity(intent);
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}