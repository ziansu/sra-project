@java.lang.Override
public void onDisconnected(java.lang.String userId) {
    presenter.cleanConnection(userId);
}