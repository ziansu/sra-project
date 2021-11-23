private void refresh() {
    if (isAdded()) {
        showProgress(true);
        org.onebusaway.android.io.request.ObaArrivalInfoResponse lastGood = getArrivalsLoader().getLastGoodResponse();
        if (lastGood != null) {
            mLastResponseLength = lastGood.getArrivalInfo().length;
        }
        getArrivalsLoader().onContentChanged();
    }
}