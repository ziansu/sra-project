@java.lang.Override
public void taskCompleted(boolean success, java.lang.String message, org.json.JSONObject json) {
    removeLoadingSpinner();
    int numPoints = responseParser.parsePerformSpin(json);
    if (success && (numPoints > 0)) {
        delegate.spinPassed(numPoints);
    }else {
        message = responseParser.parseErrorOrDefault(message);
        delegate.spinFailed(message);
    }
}