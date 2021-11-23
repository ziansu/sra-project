private void toggleLogMode() {
    nl.asymmetrics.droidshows.DroidShows.logMode ^= true;
    getSeries();
    nl.asymmetrics.droidshows.DroidShows.removeEpisodeFromLog = "";
    nl.asymmetrics.droidshows.DroidShows.listView.setSelection(0);
}