@java.lang.Override
protected java.lang.String doInBackground(org.json.JSONObject... params) {
    try {
        status = Status.running;
        token = getAccessToken(activity, chosenEmail, com.flatflatching.flatflatching.helpers.AbstractGetAuthTokenTask.SCOPE);
        if (((token) != null) || ((status) == (Status.userRecoverableError))) {
            if ((token) != null) {
                status = Status.okay;
                handleToken(token);
                postToken();
            }
        }else {
            status = Status.requestFailed;
        }
    } catch (java.lang.Exception ex) {
        token = null;
        status = Status.requestFailed;
    }
    return token;
}