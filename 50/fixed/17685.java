void startTimer() {
    if ((_currentProject) != null) {
        _projectListener = native_hooks.ActivityGlobalListener.of(_currentProject);
        _projectListener.startTracking();
        _timer.start();
        _view.blockButtonsOnTimerStart();
    }
}