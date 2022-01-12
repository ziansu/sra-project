Alg.TreeDecomposition.Bag findNum(java.lang.Integer n) {
    if (n == (num)) {
        return this;
    }else {
        for (Alg.TreeDecomposition.Bag b : children) {
            Alg.TreeDecomposition.Bag c = b.findNum(n);
            if (c != null) {
                return c;
            }
        }
    }
    return null;
}