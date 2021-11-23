public android.app.Notification.Builder addAction(android.app.Notification.Action action) {
    if (action != null) {
        mActions.add(action);
    }
    return this;
}