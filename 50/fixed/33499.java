public void syncAllWindows() {
    for (java.lang.Integer activityClass : activitiesStack.keySet()) {
        syncAllWindows(activityClass);
    }
}