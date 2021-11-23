@java.lang.Override
public void taskCompleted(boolean success, java.lang.String message, org.json.JSONObject json) {
    removeLoadingSpinner();
    if (success) {
        int numPoints = responseParser.parsePerformSpin(json);
        if (numPoints > 0) {
            delegate.spinPassed(numPoints);
            return ;
        }
    }
    message = responseParser.parseErrorOrDefault(message);
    delegate.spinFailed(message);
}