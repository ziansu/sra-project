@java.lang.Override
public java.util.Iterator<jsat.linear.IndexValue> getNonZeroIterator(int start) {
    return jsat.linear.VecPaired.extractTrueVec(vector).getNonZeroIterator(start);
}