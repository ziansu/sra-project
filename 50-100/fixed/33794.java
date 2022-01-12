public freenet.support.io.DelayedFree[] grabBucketsToFree() {
    synchronized(this) {
        if (bucketsToFree.isEmpty())
            return null;
        
        freenet.support.io.DelayedFree[] buckets = bucketsToFree.toArray(new freenet.support.io.DelayedFree[bucketsToFree.size()]);
        bucketsToFree.clear();
        return buckets;
    }
}