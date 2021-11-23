public synchronized boolean lockRoute(int trainID, int entry, java.lang.Integer exit) {
    if ((exit != null) && (!(isValidRoute(entry, exit)))) {
        return false;
    }
    queue.add(trainID);
    return (queue.size()) == 1;
}