public static void incomingUserData(fforganizer.data.users.User user) {
    fforganizer.ResourceLoader.user = user;
    fforganizer.TargetSelector.initSelf(user);
    fforganizer.ResourceLoader.checkForFinish();
}