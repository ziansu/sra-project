@java.lang.Override
public void run() {
    iso.piotrowski.marek.nyndro.statistics.HistoryAnalysis[] historyAnalysises = getPresenter().doHistoryAnalysis();
    new android.os.Handler(iso.piotrowski.marek.nyndro.Application.NyndroApp.getContext().getMainLooper()).post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            getPresenter().propagateAnalysis(historyAnalysises);
        }
    });
}