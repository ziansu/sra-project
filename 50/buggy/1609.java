@java.lang.Override
public void reduce(water.rapids.ast.prims.reducers.AstTopN.GrabTopNPQ<E> other) {
    if (_csLong)
        mergeArraysL(this._rowIndices, other._rowIndices, this._lValues, other._lValues);
    else
        mergeArraysD(this._rowIndices, other._rowIndices, this._dValues, other._dValues);
    
}