@java.lang.Override
public void call(java.lang.Object... args) {
    org.json.JSONObject response = ((org.json.JSONObject) (args[0]));
    if ((getTarget()) != null)
        getTarget().onNewMessage(response);
    
}