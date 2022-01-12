private void updateRatesFromSource() {
    if ((rateUpdater) instanceof com.github.polurival.cc.model.updater.CBRateUpdaterTask) {
        ((com.github.polurival.cc.model.updater.CBRateUpdaterTask) (rateUpdater)).execute();
    }else
        if ((rateUpdater) instanceof com.github.polurival.cc.model.updater.YahooRateUpdaterTask) {
            ((com.github.polurival.cc.model.updater.YahooRateUpdaterTask) (rateUpdater)).execute();
        }
    
    taskCancelerHandler.postDelayed(taskCanceler, (15 * 1000));
    hideMenuWhileUpdating();
}