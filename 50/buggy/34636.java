public void onKlassenListUpdated() {
    de.conradowatz.jkgvertretung.activities.MainActivity mainActivity = ((de.conradowatz.jkgvertretung.activities.MainActivity) (getActivity()));
    showKlassen(mainActivity.vertretungsAPI.getKlassenList());
}