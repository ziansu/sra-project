@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    if ((fm.findFragmentById(R.id.map_content_frame)) == null) {
        map = new org.smap.smapTask.android.fragments.MapFragment();
        fm.beginTransaction().add(android.R.id.content, map).commit();
        mo = new org.smap.smapTask.android.loaders.MapLocationObserver(getApplicationContext(), map);
    }
}