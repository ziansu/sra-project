private void dispatchAction(java.lang.String message) {
    java.lang.String jsonTestObj = "{\"type\": \"error\", \"body\": \"some blabla. \"}";
    controlpanel.Action action = this.gson.fromJson(jsonTestObj, controlpanel.Action.class);
    switch (action.type) {
        case "SUCCESS_STEP" :
            successStep();
            break;
        case "STATUS_MESSAGE" :
            break;
        case "ERROR" :
            break;
        default :
            java.lang.System.out.println("Error: Invalid action was dispatched!");
            break;
    }
}