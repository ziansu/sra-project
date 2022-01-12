public void run() {
    boolean[] available = impl.canSendMail(null, getContext());
    java.util.List<org.apache.cordova.PluginResult> messages = new java.util.ArrayList<org.apache.cordova.PluginResult>();
    messages.add(new org.apache.cordova.PluginResult(PluginResult.Status.OK, available[0]));
    messages.add(new org.apache.cordova.PluginResult(PluginResult.Status.OK, available[1]));
    org.apache.cordova.PluginResult result = new org.apache.cordova.PluginResult(PluginResult.Status.OK, messages);
    command.sendPluginResult(result);
}