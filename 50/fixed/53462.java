@java.lang.Override
public aljebra.data.sparse.SparseVector sub(double value) {
    aljebra.data.sparse.SparseVector result = new aljebra.data.sparse.SparseVector(size);
    for (int i : ids) {
        result.set(i, ((get(i)) - value));
    }
    return result;
}