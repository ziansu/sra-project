public void startRequestProcess() {
    jahirfiquitiva.iconshowcase.utilities.Preferences mPrefs = new jahirfiquitiva.iconshowcase.utilities.Preferences(getActivity());
    if ((getResources().getInteger(R.integer.max_apps_to_request)) > 0) {
    }else {
        showRequestsFilesCreationDialog(getActivity(), mPrefs);
    }
}