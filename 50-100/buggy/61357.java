@java.lang.Override
public void taskCompleted(boolean success, java.lang.String message, org.json.JSONObject json) {
    removeLoadingSpinner();
    uk.ac.ncl.csc2022.t14.bankingapp.server.live.ObjectHolder<java.lang.Integer> numPoints = new uk.ac.ncl.csc2022.t14.bankingapp.server.live.ObjectHolder();
    if (success && (responseParser.parsePerformSpin(json, numPoints))) {
        delegate.spinPassed(numPoints.getValue());
    }else {
        message = responseParser.parseErrorOrDefault(message);
        delegate.spinFailed(message);
    }
}