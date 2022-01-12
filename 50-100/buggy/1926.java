public boolean validateLine() {
    for (java.util.List<java.lang.Integer> line : _matrix) {
        java.util.Set<java.lang.Integer> verifier = new java.util.HashSet<>();
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