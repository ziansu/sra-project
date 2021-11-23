public void run() {
    try {
        engine.quit();
    } catch (java.lang.Throwable t) {
    }
    raptor.Raptor.getInstance().getDisplay().asyncExec(new raptor.util.RaptorRunnable() {
        @java.lang.Override
        public void execute() {
            startStopButton.setText(raptor.swt.chess.analysis.UciAnalysisWidget.local.getString("uciAnalW_44"));
        }
    });
}