private void showHelpDialog() {
    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    android.app.Fragment prev = getFragmentManager().findFragmentByTag("dialog");
    if (prev != null) {
        ft.remove(prev);
    }
    android.app.DialogFragment newFragment = be.howest.nmct.targit.views.infogamemode.InfoGameHelpFragment.newInstance(be.howest.nmct.targit.Constants.EXTRA_GAMEMODE_MEMORIT);
    newFragment.show(ft, "dialog");
}