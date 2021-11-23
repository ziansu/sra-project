@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    android.support.v4.app.Fragment fragment = null;
    switch (position) {
        case 0 :
            fragment = com.fbm.nkd.cs403x_final.SectionsPagerAdapter.cameraFragment;
            break;
        case 1 :
            fragment = com.fbm.nkd.cs403x_final.SectionsPagerAdapter.feedFragment;
            break;
        case 2 :
            fragment = com.fbm.nkd.cs403x_final.SectionsPagerAdapter.mapFragment;
            break;
    }
    return fragment;
}