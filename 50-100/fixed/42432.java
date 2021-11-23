private void maybeContinueLoading() {
    long nextLoadPositionUs = loadingPeriodHolder.mediaPeriod.getNextLoadPositionUs();
    if (nextLoadPositionUs != (C.TIME_END_OF_SOURCE)) {
        long loadingPeriodPositionUs = (rendererPositionUs) - (loadingPeriodHolder.rendererPositionOffsetUs);
        long bufferedDurationUs = nextLoadPositionUs - loadingPeriodPositionUs;
        boolean continueLoading = loadControl.shouldContinueLoading(bufferedDurationUs);
        setIsLoading(continueLoading);
        if (continueLoading) {
            loadingPeriodHolder.needsContinueLoading = false;
            loadingPeriodHolder.mediaPeriod.continueLoading(loadingPeriodPositionUs);
        }else {
            loadingPeriodHolder.needsContinueLoading = true;
        }
    }else {
        setIsLoading(false);
    }
}