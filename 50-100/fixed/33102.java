public void assignActionsToBehaviors() {
    for (org.tndata.android.compass.model.Behavior behavior : getBehaviors()) {
        java.util.ArrayList<org.tndata.android.compass.model.Action> behaviorActions = new java.util.ArrayList<org.tndata.android.compass.model.Action>();
        for (org.tndata.android.compass.model.Action action : getActions()) {
            if ((behavior.getId()) == (action.getBehavior_id())) {
                behaviorActions.add(action);
            }
        }
        behavior.setActions(behaviorActions);
    }
    setActionParents();
}