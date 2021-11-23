public freenet.support.io.DelayedFree[] grabBucketsToFree() {
    synchronized(this) {
        if (bucketsToFree.isEmpty())
            return null;
        
        freenet.support.io.DelayedFreeBucket[] buckets = bucketsToFree.toArray(new freenet.support.io.DelayedFreeBucket[bucketsToFree.size()]);
        bucketsToFree.clear();
        return buckets;
    }
}