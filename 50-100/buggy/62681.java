@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new com.snaphy.mapstrack.Fragment.HomeFragment();
        case 1 :
            return new com.snaphy.mapstrack.Fragment.ShareFragment();
        case 2 :
            return new com.snaphy.mapstrack.Fragment.ProfileFragment();
        case 3 :
            return new com.snaphy.mapstrack.Fragment.SettingFragment();
        default :
            return new com.snaphy.mapstrack.Fragment.HomeFragment();
    }
}