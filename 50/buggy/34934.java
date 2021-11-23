@java.lang.Override
public java.util.Iterator<jsat.linear.IndexValue> getNonZeroIterator() {
    if ((jsat.linear.VecPaired.extractTrueVec(vector)) instanceof jsat.linear.SparseVector)
        return jsat.linear.VecPaired.extractTrueVec(vector).getNonZeroIterator();
    
    return super.getNonZeroIterator();
}