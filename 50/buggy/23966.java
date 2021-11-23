@java.lang.Override
public void onClick(dess15proj5.fau.cs.osr_amos.mobiletimerecording.ui.View v) {
    if (timer.isRunning()) {
        stopCurrentSession(startStopBtn, timer);
    }else
        if (isProjectRecordingExpired()) {
            showToastFinalDateExpiredMessage();
        }else {
            startNewSession(startStopBtn, timer);
        }
    
}