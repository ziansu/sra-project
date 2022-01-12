private void updateRatesFromSource() {
    taskCancelerHandler.postDelayed(taskCanceler, (15 * 1000));
    if ((rateUpdater) instanceof com.github.polurival.cc.model.updater.CBRateUpdaterTask) {
        ((com.github.polurival.cc.model.updater.CBRateUpdaterTask) (rateUpdater)).execute();
    }else
        if ((rateUpdater) instanceof com.github.polurival.cc.model.updater.YahooRateUpdaterTask) {
            ((com.github.polurival.cc.model.updater.YahooRateUpdaterTask) (rateUpdater)).execute();
        }
    
    hideMenuWhileUpdating();
}