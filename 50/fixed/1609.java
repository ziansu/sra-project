@java.lang.Override
public void reduce(water.rapids.ast.prims.reducers.AstTopN.GrabTopNPQ<E> other) {
    if (_csLong)
        mergeArraysL(other._rowIndices, other._lValues);
    else
        mergeArraysD(other._rowIndices, other._dValues);
    
}