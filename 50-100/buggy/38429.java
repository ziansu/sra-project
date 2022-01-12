@java.lang.Override
public void taskCompleted(boolean success, java.lang.String message, org.json.JSONObject json) {
    removeLoadingSpinner();
    uk.ac.ncl.csc2022.t14.bankingapp.server.live.ObjectHolder<java.lang.Boolean> hasNewSpin = new uk.ac.ncl.csc2022.t14.bankingapp.server.live.ObjectHolder(false);
    if (success && (responseParser.parseCategorisation(json, hasNewSpin))) {
        delegate.categorisationPassed(hasNewSpin.getValue());
    }else {
        message = responseParser.parseErrorOrDefault(message);
        delegate.categorisationFailed(message);
    }
}