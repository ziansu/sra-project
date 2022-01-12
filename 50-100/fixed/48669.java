@java.lang.SuppressWarnings(value = { "unchecked" , "rawtypes" })
public com.taskerlite.taskLogic.mAction getActionObject() {
    if ((actionObject) == null) {
        switch (actionType) {
            case TIMER :
                actionObject = new com.google.gson.GsonBuilder().create().fromJson(actionINStr, com.taskerlite.taskLogic.aTimer.class);
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
    }
    return actionObject;
}