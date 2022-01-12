@java.lang.Override
public void onError(java.lang.Throwable e) {
    listener.onToast("Table already taken");
    refreshTables();
    setMatchStarting(false);
}