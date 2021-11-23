private void doError() {
    status = -1;
    com.password.locker.StateMonitor.setState(AppState.SHUTDOWN);
}