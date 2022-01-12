@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.settings_ratingapp_ll :
            ratingApp();
            break;
        case R.id.settings_updateapp_ll :
            requestUpdateData();
            break;
        case R.id.settings_wipecache_ll :
            wipeAppCahce();
            break;
        case R.id.settings_aboutus_tv :
            android.content.Intent intent = new android.content.Intent(this, com.jayfeng.androiddigest.activity.AboutUsActivity.class);
            intent.putExtra("versionName", getVersionName());
            startActivity(intent);
            break;
    }
}