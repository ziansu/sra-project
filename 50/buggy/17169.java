@java.lang.Override
public void onPolicyCheckerTaskCompleted(org.json.JSONObject response) {
    if (response.has("errorCode")) {
        handler.onLEServiceFailure(response);
    }else {
        handler.onLEServiceSuccess(response);
    }
}