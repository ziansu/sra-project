private void searchFriends() {
    friendsFile = myTask.listFiles();
    for (int i = 0; i < (friendsFile.length); i++) {
        try {
            LinuxTask task = new LinuxTask(friendsFile[i]);
            synchronized(friendGroup) {
                friendGroup.add(task);
            }
        } catch (java.io.IOException e) {
            ActiveThreadCounter.log("So fast. The new born friend is gone...");
        }
    }
}