@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.SettingItem :
            {
                android.content.Intent myIntent = new android.content.Intent(this, com.h.h.h.Settings.class);
                this.startActivity(myIntent);
                return true;
            }
        case R.id.AboutItem :
            {
                android.content.Intent myIntent = new android.content.Intent(this, com.h.h.h.About.class);
                this.startActivity(myIntent);
                return true;
            }
        default :
            return super.onOptionsItemSelected(item);
    }
}