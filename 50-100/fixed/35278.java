private void tickerRequest() {
    try {
        boolean isIntraday = _jchartComposite.getTimeFrameModel().isIntraday();
        if (isIntraday)
            _tickerFound = com.jchart.io.factory.IoFactory.getInstance(_ticker).tickerRequestIntraday(_ticker, _jchartComposite);
        else {
            _tickerFound = com.jchart.io.factory.IoFactory.getInstance(_ticker).tickerRequestEod(_ticker, _jchartComposite);
        }
        if (_quoteDataModel.isLiveQuote()) {
            _quoteDataModel.liveQuote();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    _tickerListener.requestComplete(_tickerFound);
}