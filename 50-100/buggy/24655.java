@java.lang.Override
protected android.support.v4.app.Fragment createItem(int position) {
    android.support.v4.app.Fragment fragment;
    switch (position) {
        case 0 :
            fragment = org.sebbas.android.memegenerator.fragments.GifChildFragment.newInstance(RecyclerFragment.GRID_LAYOUT, false);
            break;
        case 1 :
            fragment = org.sebbas.android.memegenerator.fragments.GifChildFragment.newInstance(RecyclerFragment.GRID_LAYOUT, false);
            break;
        case 2 :
            fragment = org.sebbas.android.memegenerator.fragments.GifChildFragment.newInstance(RecyclerFragment.GRID_LAYOUT, false);
            break;
        default :
            fragment = org.sebbas.android.memegenerator.fragments.GifChildFragment.newInstance(RecyclerFragment.GRID_LAYOUT, false);
            break;
    }
    return fragment;
}