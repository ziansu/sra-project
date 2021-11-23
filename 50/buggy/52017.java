private void assurePlayerInit() {
    if (null == (mPlayer)) {
        mPlayer = com.google.samples.apps.topeka.helper.PreferencesHelper.getPlayer(getActivity());
    }
}