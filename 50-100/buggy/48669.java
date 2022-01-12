@java.lang.SuppressWarnings(value = { "unchecked" , "rawtypes" })
public com.taskerlite.taskLogic.mAction getActionObject() {
    if ((actionObject) == null) {
        java.lang.Class deserializationClass = null;
        switch (actionType) {
            case TIMER :
                deserializationClass = com.taskerlite.taskLogic.aTimer.class;
                break;
            case FINISHBOOT :
                break;
            case SCREENOFF :
                break;
            case SCREENON :
                break;
            default :
                break;
        }
        actionObject = new com.google.gson.GsonBuilder().create().fromJson(actionINStr, com.taskerlite.taskLogic.mAction.class);
    }
    return actionObject;
}