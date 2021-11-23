public void run() {
    try {
        com.parse.ParseInstallation.getCurrentInstallation().save();
        com.parse.PushService.setDefaultPushCallback(cordova.getActivity(), cordova.getActivity().getClass());
        callbackContext.success();
    } catch (com.parse.ParseException pe) {
        callbackContext.error((("Parse error " + (pe.getCode())) + ", Can't save Installation at this time."));
    }
}