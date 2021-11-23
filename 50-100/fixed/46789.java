private int searchFriends() {
    friendsFile = myTask.listFiles();
    if ((friendsFile) == null) {
        return -1;
    }
    for (int i = 0; i < (friendsFile.length); i++) {
        try {
            LinuxTask task = new LinuxTask(friendsFile[i]);
            friendGroup.add(task);
        } catch (java.io.IOException e) {
            ActiveThreadCounter.log("So fast. The new born friend is gone...");
        }
    }
    return 0;
}