@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 1 :
            return new hu.gdf.norbi.tabbedpagewithfragments.fragments.MainFragment();
        case 2 :
            return new hu.gdf.norbi.tabbedpagewithfragments.fragments.CartFragment();
    }
    return new hu.gdf.norbi.tabbedpagewithfragments.fragments.WishListFragment();
}