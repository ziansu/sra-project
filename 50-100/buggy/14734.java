@java.lang.Override
public void onClick(android.view.View v) {
    switch (currentState) {
        case STATE_RESET :
            nfcBenchmarkFragment.setStateToRunning();
            currentState = RUNNING;
            return ;
        case RUNNING :
            nfcBenchmarkFragment.setStateToStopped();
            currentState = STATE_STOPPED;
            return ;
        case STATE_STOPPED :
            nfcBenchmarkFragment.setStateToReset();
            currentState = STATE_RESET;
            return ;
    }
}