@java.lang.Override
public aljebra.data.sparse.SparseVector scale(double factor) {
    if (factor == 0.0) {
        return new aljebra.data.sparse.SparseVector(size);
    }
    aljebra.data.sparse.SparseVector result = new aljebra.data.sparse.SparseVector(size);
    for (int i : ids) {
        result.set(i, ((data[i]) * factor));
    }
    return result;
}