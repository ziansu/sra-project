@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    mViewPager = ((android.support.v4.view.ViewPager) (view.findViewById(R.id.vp_TicketsActivity)));
    mServiceRequests = getArguments().getParcelableArrayList(com.github.codetanzania.ui.fragment.ServiceRequestsFragment.SERVICE_REQUESTS);
    mViewPager.setAdapter(new com.github.codetanzania.adapter.IssueListPagerAdapter(getChildFragmentManager(), mServiceRequests));
}