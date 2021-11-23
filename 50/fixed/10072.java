@java.lang.Override
public void onError(java.lang.Throwable e) {
    view.currentUserFailedToReceive(e);
    view.completedCurrentUserRequest();
}