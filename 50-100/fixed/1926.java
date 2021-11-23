public boolean validateLine() {
    for (java.util.List<java.lang.Integer> line : _matrix) {
        java.util.Set<java.lang.Integer> verifier = new java.util.HashSet<>();
        if ((line.size()) != (this._matrix.size())) {
            return false;
        }
        for (java.lang.Integer num : line) {
            if (verifier.contains(num)) {
                return false;
            }else {
                verifier.add(num);
            }
        }
    }
    return true;
}