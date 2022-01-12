@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments().containsKey(io.github.sahilshekhawat.pockethackernews.Activities.PostDetailFragment.ARG_ITEM_ID)) {
        mItem = Data.items.get(java.lang.Long.parseLong(getArguments().getString(io.github.sahilshekhawat.pockethackernews.Activities.PostDetailFragment.ARG_ITEM_ID)));
        android.app.Activity activity = this.getActivity();
        android.support.design.widget.CollapsingToolbarLayout appBarLayout = ((android.support.design.widget.CollapsingToolbarLayout) (activity.findViewById(R.id.toolbar_layout)));
        if (appBarLayout != null) {
            appBarLayout.setTitle("");
        }
    }
}