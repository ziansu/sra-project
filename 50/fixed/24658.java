public dna.features.SparseVector getACopy() {
    dna.features.SparseVector copy = new dna.features.SparseVector();
    for (double value : this) {
        copy.add(value);
    }
    return copy;
}