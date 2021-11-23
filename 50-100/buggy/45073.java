private void refresh() {
    if (isAdded()) {
        org.onebusaway.android.util.UIUtils.showProgress(this, true);
        org.onebusaway.android.io.request.ObaArrivalInfoResponse lastGood = getArrivalsLoader().getLastGoodResponse();
        if (lastGood != null) {
            mLastResponseLength = lastGood.getArrivalInfo().length;
        }
        getArrivalsLoader().onContentChanged();
    }
}