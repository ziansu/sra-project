@java.lang.Override
public void onUserList(java.util.List<java.lang.String> users) {
    channelsFuture.setResult(users);
}