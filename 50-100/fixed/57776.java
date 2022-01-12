public void notifyFriendsToUpdateState() {
    java.util.Iterator<LinuxTask> iter = friendGroup.iterator();
    while (iter.hasNext()) {
        LinuxTask friend = iter.next();
        try {
            friend.updateState();
        } catch (java.io.IOException e) {
            ActiveThreadCounter.log("An old friend is gone. RIP. He is no longer in my friend list anymore.");
            iter.remove();
        }
    } 
}