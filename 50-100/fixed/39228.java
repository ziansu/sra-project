@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments().containsKey(acodexm.futuremindapp.ItemDetailFragment.ARG_ITEM_TITLE)) {
        android.app.Activity activity = this.getActivity();
        android.support.design.widget.CollapsingToolbarLayout appBarLayout = ((android.support.design.widget.CollapsingToolbarLayout) (activity.findViewById(R.id.toolbar_layout)));
        if (appBarLayout != null) {
            appBarLayout.setTitle(getArguments().getString(acodexm.futuremindapp.ItemDetailFragment.ARG_ITEM_TITLE));
        }
    }
}