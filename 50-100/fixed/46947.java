public void updateCallTime() {
    final com.android.incallui.CallCardPresenter.CallCardUi ui = getUi();
    if (ui == null) {
        mCallTimer.cancel();
    }else
        if (!(isPrimaryCallActive())) {
            ui.setPrimaryCallElapsedTime(false, 0);
            mCallTimer.cancel();
        }else {
            final long callStart = mPrimary.getConnectTimeMillis();
            if (callStart > 0) {
                final long duration = (java.lang.System.currentTimeMillis()) - callStart;
                ui.setPrimaryCallElapsedTime(true, duration);
            }
        }
    
}