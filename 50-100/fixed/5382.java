public void clearFilter(android.view.View v) {
    nl.asymmetrics.droidshows.DroidShows.main.setVisibility(View.INVISIBLE);
    keyboard.hideSoftInputFromWindow(nl.asymmetrics.droidshows.DroidShows.searchV.getWindowToken(), 0);
    nl.asymmetrics.droidshows.DroidShows.searchV.setText("");
    findViewById(R.id.search).setVisibility(View.GONE);
    getSeries();
}