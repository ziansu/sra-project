@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return com.abc.huoyun.HorderCreateFragment.newInstance();
        case 1 :
            return com.abc.huoyun.TruckFragment.newInstance();
        case 2 :
            return com.abc.huoyun.MyHorderFragment.newInstance();
        case 3 :
            return com.abc.huoyun.MeFragment.newInstance();
        default :
            return com.abc.huoyun.HorderCreateFragment.newInstance();
    }
}