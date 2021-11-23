@java.lang.Override
public void onResume() {
    super.onResume();
    new org.apache.taverna.mobile.utils.WorkflowLoader(getActivity(), org.apache.taverna.mobile.fragments.WorkflowItemFragment.mListView, swipeRefreshLayout).execute();
}