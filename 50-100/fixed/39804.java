public synchronized boolean unlockRoute(int trainID) {
    if (((queue.size()) > 0) && ((queue.get(0)) == trainID)) {
        queue.remove(0);
        return true;
    }else {
        return false;
    }
}