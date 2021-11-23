private void swap(int i, int j) {
    com.hamsterviel01.www.entity.PostEntity tmp = listOfAllPosts.get(i);
    java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();
    try {
        writeLock.lock();
        listOfAllPosts.set(i, listOfAllPosts.get(j));
        listOfAllPosts.set(j, tmp);
    } finally {
        writeLock.unlock();
    }
}