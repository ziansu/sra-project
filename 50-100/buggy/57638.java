public synchronized void addVisited(java.lang.String currentURL) {
    currentlyVisiting.remove(currentURL);
    visited.add(currentURL);
    if (((visited.size()) >= (lab4.SpiderMonitor.LIMIT)) || ((toBeVisited.isEmpty()) && (currentlyVisiting.isEmpty()))) {
        timeToKill = true;
        notifyAll();
    }
}