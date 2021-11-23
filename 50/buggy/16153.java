@java.lang.Override
public void run() {
    com.mapbox.mapboxsdk.Mapbox.getInstance(this, getString(R.string.mapbox_access_token));
    fragMap = new com.operontech.maroon.frag.FragmentMap();
    fManager.beginTransaction().add(R.id.main_fragment, fragMap).hide(fragMap).commit();
}