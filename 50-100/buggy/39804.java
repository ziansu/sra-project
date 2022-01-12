public synchronized boolean unlockRoute(int trainID) {
    if (((queue.size()) > 1) && ((queue.get(0)) == trainID)) {
        queue.remove(0);
        return true;
    }else {
        return false;
    }
}