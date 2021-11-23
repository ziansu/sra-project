@java.lang.Override
public void taskCompleted(boolean success, java.lang.String message, org.json.JSONObject json) {
    if (success && (responseParser.parseLogout(json))) {
        delegate.logoutPassed();
    }else {
        message = responseParser.parseErrorOrDefault(message);
        delegate.logoutFailed(message);
    }
}