@java.lang.Override
public void onRefresh() {
    new org.apache.taverna.mobile.utils.WorkflowLoader(getActivity(), swipeRefreshLayout).execute();
}