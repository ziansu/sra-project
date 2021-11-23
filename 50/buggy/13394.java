@java.lang.Override
protected java.lang.Void executeAsync() throws java.io.IOException {
    getApi().reportRanking(getSessionId(), winnerId, loserId);
    return null;
}