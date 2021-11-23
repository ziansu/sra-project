@java.lang.Override
public T next(T reuse) throws java.io.IOException {
    if ((recordArea.getReadPosition()) < (endPosition)) {
        while (true) {
            final boolean isAbandoned = (recordArea.readLong()) == (org.apache.flink.runtime.operators.hash.ReduceHashTable.ABANDONED_RECORD);
            reuse = recordArea.readRecord(reuse);
            if (!isAbandoned) {
                return reuse;
            }
        } 
    }else {
        return null;
    }
}