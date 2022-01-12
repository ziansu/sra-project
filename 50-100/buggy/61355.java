private static java.util.concurrent.locks.ReentrantLock getLock(java.lang.String projectTag) {
    if (!(edu.scripps.yates.server.ProjectLocker.projectLocked.containsKey(projectTag))) {
        java.util.concurrent.locks.ReentrantLock lock = new java.util.concurrent.locks.ReentrantLock(true);
        edu.scripps.yates.server.ProjectLocker.projectLocked.put(projectTag, lock);
    }
    return edu.scripps.yates.server.ProjectLocker.projectLocked.get(projectTag);
}