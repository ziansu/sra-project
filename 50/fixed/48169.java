protected void removeHandler() {
    io.realm.BaseRealm.handlers.remove(handler);
    handler.removeCallbacksAndMessages(null);
    this.handler = null;
}