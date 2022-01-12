@java.lang.Override
public void onAdapterAboutToEmpty(int itemsInAdapter) {
    if (!(noMoreResults)) {
        if ((cardsArrayAdapter.getCount()) > 3) {
            timesAPICalledUserLocation += 20;
            timesAPICalledCoordinates += 20;
            setStartLocationOption();
            android.util.Log.d("onAdapterAboutToEmpty", "called");
        }
    }else {
        if ((cardsList.size()) < 2) {
            setDialog(getString(R.string.low_matches_title), getString(R.string.low_matches_message), android.R.drawable.ic_dialog_alert);
        }
    }
}