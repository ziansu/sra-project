@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    mMembers = new ca.rmen.android.scrumchatter.member.list.Members(((android.support.v4.app.FragmentActivity) (activity)));
    mPrefs = android.preference.PreferenceManager.getDefaultSharedPreferences(activity);
    mPrefs.registerOnSharedPreferenceChangeListener(mPrefsListener);
    mTeamId = mPrefs.getInt(Constants.PREF_TEAM_ID, Constants.DEFAULT_TEAM_ID);
    getLoaderManager().initLoader(ca.rmen.android.scrumchatter.member.list.MembersListFragment.URL_LOADER, null, mLoaderCallbacks);
}