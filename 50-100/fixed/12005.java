@java.lang.Override
public void taskCompleted(uk.ac.ncl.csc2022.t14.bankingapp.server.live.json.JSONTaskStatus status, java.lang.String message, org.json.JSONObject json) {
    removeLoadingSpinner();
    if ((status == (uk.ac.ncl.csc2022.t14.bankingapp.server.live.json.JSONTaskStatus.PASSED)) && (responseParser.parseLogin(json))) {
        delegate.loginPassed(uk.ac.ncl.csc2022.t14.bankingapp.Utilities.DataStore.sharedInstance().getCurrentUser());
    }else {
        message = responseParser.parseErrorOrDefault(message);
        delegate.loginFailed(message);
    }
}