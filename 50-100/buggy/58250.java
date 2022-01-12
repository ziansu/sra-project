@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    if (PreferencesPresetsFragment.onlineRequestIsRunning) {
        cancel(true);
    }
    PreferencesPresetsFragment.onlineRequestIsRunning = true;
    PreferencesPresetsFragment.onlineList.startAnimation(de.NeonSoft.neopowermenu.helpers.AnimationUtils.loadAnimation(PreferencesPresetsFragment.mContext, R.anim.fade_out));
    PreferencesPresetsFragment.onlineList.setVisibility(View.GONE);
    if ((PreferencesPresetsFragment.onlineAdapter) != null) {
        PreferencesPresetsFragment.onlineAdapter.removeAll();
    }
    PreferencesPresetsFragment.onlineMSG.setText("Loading...");
    PreferencesPresetsFragment.onlineMSG.setVisibility(View.VISIBLE);
    PreferencesPresetsFragment.onlineMSG.startAnimation(de.NeonSoft.neopowermenu.helpers.AnimationUtils.loadAnimation(PreferencesPresetsFragment.mContext, R.anim.fade_in));
}