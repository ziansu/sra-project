@java.lang.Override
public void onResume() {
    super.onResume();
    createSocketListeners();
    mUsername = com.niemisami.wedu.settings.WeduPreferenceHelper.getUsername(getActivity());
}