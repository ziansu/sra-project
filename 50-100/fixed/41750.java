@java.lang.Override
protected void updateView(java.util.ArrayList<casaubon.outdooradventures.OutdoorDetails> parks) {
    mParkList = parks;
    setupAdapter();
    if ((mParkList.size()) == 0) {
        android.widget.Toast.makeText(getActivity(), ("There are no Parks that meet the search criteria. " + "Please check your location settings for any added filters."), Toast.LENGTH_LONG).show();
    }
    mProgressBar.setVisibility(View.GONE);
    ((android.view.ViewGroup) (mProgressBar.getParent())).removeView(mProgressBar);
}