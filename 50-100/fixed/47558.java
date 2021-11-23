@java.lang.Override
protected void setUp() throws java.lang.Exception {
    super.setUp();
    setActivityInitialTouchMode(true);
    mActivity = getActivity();
    claimantButton = ((android.widget.Button) (mActivity.findViewById(R.id.claimantButton)));
    approverButton = ((android.widget.Button) (mActivity.findViewById(R.id.approverButton)));
}