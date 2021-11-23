@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return mRallyActive ? new onl.deepspace.zoorallye.fragments.MapFragment() : new onl.deepspace.zoorallye.fragments.StartRallyFragment();
        case 1 :
            return mRallyActive ? new onl.deepspace.zoorallye.fragments.InfoFragment() : new onl.deepspace.zoorallye.fragments.MapFragment();
    }
    return null;
}