private void initImageView() {
    int[] ids = rootView.getIds();
    android.view.View[] pageview = rootView.getPageView();
    for (int i = 0; i < (ids.length); i++)
        android.util.Log.d(TAG, ("initImageView: " + (ids[i])));
    
    android.view.View vp = rootView.findViewById(R.id.gift_list_layout_viewpager);
}