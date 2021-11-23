private void dispatchAction(java.lang.String message) {
    controlpanel.Action action = this.gson.fromJson(message, controlpanel.Action.class);
    switch (action.getType()) {
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