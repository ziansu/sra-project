@java.lang.Override
public int compareTo(org.apache.lucene.replicator.nrt.CopyJob _other) {
    org.apache.lucene.replicator.nrt.SimpleCopyJob other = ((org.apache.lucene.replicator.nrt.SimpleCopyJob) (_other));
    if ((highPriority) != (other.highPriority)) {
        return highPriority ? -1 : 1;
    }else
        if ((ord) < (other.ord)) {
            return -1;
        }else {
            return 0;
        }
    
}