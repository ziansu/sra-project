@java.lang.Override
public boolean onSearchRequested() {
    if ((findViewById(R.id.search).getVisibility()) != (android.view.View.VISIBLE)) {
        findViewById(R.id.search).setVisibility(View.VISIBLE);
        getSeries(2, false);
    }
    nl.asymmetrics.droidshows.DroidShows.searchV.requestFocus();
    nl.asymmetrics.droidshows.DroidShows.searchV.selectAll();
    keyboard.showSoftInput(nl.asymmetrics.droidshows.DroidShows.searchV, 0);
    return true;
}