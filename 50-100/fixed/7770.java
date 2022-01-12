private double getPriorForStructure(int numParents) {
    double e = getStructurePrior();
    int k = numParents;
    int vm = (data.length) - 1;
    return (k * (java.lang.Math.log((e / vm)))) + ((vm - k) * (java.lang.Math.log((1.0 - (e / vm)))));
}