public void toggleEvent(controllers.Toggle t) {
    controllers.Toggle[] ts = toggles.get(t.getGroupName());
    if (ts != null) {
        for (int i = 0; i < (ts.length); i++) {
            ts[i].setState(((ts[i]) == t));
            controllable.setVariable(t.getGroupName(), t.getName());
        }
    }
}