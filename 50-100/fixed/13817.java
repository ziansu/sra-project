@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_task_proposal, container, false);
    unbinder = butterknife.ButterKnife.bind(this, view);
    mCollapsingToolbar.setExpandedTitleColor(mTransparent);
    mCollapsingToolbar.setContentScrimColor(mPrimaryDark);
    mCollapsingToolbar.setStatusBarScrimColor(mPrimaryDark);
    initToolbar();
    setupViewPager();
    getTaskData();
    return view;
}