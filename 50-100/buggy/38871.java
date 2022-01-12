public aljebra.sparse.SparseVector col(int j) {
    assert (j >= 0) && (j < (cols));
    aljebra.sparse.SparseVector sv = new aljebra.sparse.SparseVector(rows);
    for (int i = colPtr[j]; i < (rowPtr[(j + 1)]); ++i) {
        sv.set(rowInd[i], colData[i]);
    }
    return sv;
}