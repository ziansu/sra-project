private void sendBroadcastWithPermission(android.content.Intent intent, java.lang.String receiverPermission) {
    java.util.List<org.robolectric.shadows.ShadowApplication.Wrapper> wrappers = getAppropriateWrappers(intent, receiverPermission);
    postToWrappers(wrappers, intent);
}