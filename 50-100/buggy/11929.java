@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.activity_main_toolbar, menu);
    mPathItem = menu.findItem(R.id.main_toolbar_path);
    mTrafficItem = menu.findItem(R.id.main_toolbar_traffic);
    if (getSharedBoolean(SharedPrefs.KEY_SHOW_PATH))
        mPathItem.setIcon(R.drawable.road_variant_on);
    
    if (getSharedBoolean(SharedPrefs.KEY_SHOW_TRAFFIC))
        mTrafficItem.setIcon(R.drawable.ic_traffic_24dp_on);
    
    timber.log.Timber.d("onCreateOptionsMenu");
    return true;
}