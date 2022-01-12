@java.lang.Override
@hugo.weaving.DebugLog
public void onError(java.lang.Exception error) {
    addFragment();
    openDialogFragment(new nl.hnogames.domoticz.Fragments.Changelog());
}