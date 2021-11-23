private void runStackStart() throws java.lang.Exception {
    java.lang.String displayIdStr = nextArgRequired();
    int displayId = java.lang.Integer.parseInt(displayIdStr);
    android.content.Intent intent = makeIntent(UserHandle.USER_CURRENT);
    try {
        android.app.IActivityContainer container = mAm.createStackOnDisplay(displayId);
        if (container != null) {
            container.startActivity(intent);
        }
    } catch (android.os.RemoteException e) {
    }
}