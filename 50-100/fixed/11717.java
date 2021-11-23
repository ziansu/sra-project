@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments().containsKey(com.example.jeffrey.finalprototype.CommuteDetailFragment.ARG_ITEM_ID)) {
        mItem = Content.COMMUTE_MAP.get(getArguments().getString(com.example.jeffrey.finalprototype.CommuteDetailFragment.ARG_ITEM_ID));
        android.app.Activity activity = this.getActivity();
        android.support.design.widget.CollapsingToolbarLayout appBarLayout = ((android.support.design.widget.CollapsingToolbarLayout) (activity.findViewById(R.id.toolbar_layout)));
        if ((appBarLayout != null) && ((mItem) != null)) {
            appBarLayout.setTitle(mItem.id);
        }
    }
}