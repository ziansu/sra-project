@java.lang.Override
public aljebra.data.sparse.SparseVector times(aljebra.data.IVector that) {
    assert (size) == (that.size());
    aljebra.data.sparse.SparseVector result = new aljebra.data.sparse.SparseVector(size);
    for (int i : ids) {
        result.set(i, ((get(i)) * (that.get(i))));
    }
    return result;
}