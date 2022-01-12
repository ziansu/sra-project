@java.lang.Override
public void result(com.hpe.alm.octane.Result result) {
    if ((_currentStep) != null) {
        _currentStep.setStatus(result.getStatus());
        _currentStep.setDuration(result.getDuration());
        if ((result.getErrorMessage()) != null) {
            _currentStep.setErrorMessage(result.getErrorMessage());
        }
        _currentStep = null;
    }
}