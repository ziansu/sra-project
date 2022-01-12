@java.lang.Override
public void setPosition(float x, float y, float z) {
    stateLock.writeLock().lock();
    try {
        this.x = x;
        this.y = y;
        this.z = z;
        posModified = true;
    } finally {
        stateLock.writeLock().unlock();
    }
}