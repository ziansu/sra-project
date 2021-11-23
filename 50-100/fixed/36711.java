@java.lang.Override
public boolean remove(byte[] key) throws java.io.IOException {
    org.opendedup.collections.ShardedFileByteArrayLongMap2.Shard sh = this.getMap(key);
    synchronized(sh) {
        if (sh.remove(key)) {
            this.lastFound.set(java.lang.System.currentTimeMillis());
            this.sz.decrementAndGet();
            synchronized(this) {
                this.full = false;
            }
            return true;
        }else {
            return false;
        }
    }
}