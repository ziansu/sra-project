public void stopLoading() {
    if ((getActivity()) != null) {
        android.app.ActionBar actionBar = getActivity().getActionBar();
        if (actionBar != null) {
            actionBar.setSubtitle(null);
        }
    }
}