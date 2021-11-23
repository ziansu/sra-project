public synchronized boolean lockRoute(int trainID, int entry, int exit) {
    if (!(isValidRoute(entry, exit))) {
        return false;
    }
    queue.add(trainID);
    return (queue.size()) == 1;
}