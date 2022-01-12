@java.lang.Override
public void onResume() {
    super.onResume();
    new org.apache.taverna.mobile.utils.WorkflowLoader(getActivity(), swipeRefreshLayout).execute();
}