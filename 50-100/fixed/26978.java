@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    mMembers = new ca.rmen.android.scrumchatter.member.list.Members(((android.support.v4.app.FragmentActivity) (context)));
    mPrefs = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    mPrefs.registerOnSharedPreferenceChangeListener(mPrefsListener);
    mTeamId = mPrefs.getInt(Constants.PREF_TEAM_ID, Constants.DEFAULT_TEAM_ID);
    getLoaderManager().initLoader(ca.rmen.android.scrumchatter.member.list.MembersListFragment.URL_LOADER, null, mLoaderCallbacks);
}