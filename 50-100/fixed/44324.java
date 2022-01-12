private void logout() {
    if (((com.umarbhutta.xlightcompanion.glance.GlanceMainFragment.devicenodes) != null) || ((GlanceMainFragment.devicenodes.size()) > 0)) {
        GlanceMainFragment.devicenodes.clear();
    }
    com.umarbhutta.xlightcompanion.main.SlidingMenuMainActivity.mShakeInfo = null;
    com.umarbhutta.xlightcompanion.Tools.SharedPreferencesUtils.putObject(getActivity(), SharedPreferencesUtils.KEY_DEVICE_LIST, null);
    com.umarbhutta.xlightcompanion.Tools.UserUtils.saveUserInfo(getActivity(), null);
    startActivity(new android.content.Intent(getActivity(), com.umarbhutta.xlightcompanion.userManager.LoginActivity.class));
    getActivity().finish();
}