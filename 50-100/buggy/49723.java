private double getPriorForStructure(int numParents) {
    double e = 1;
    int vm = (variables.size()) - 1;
    return (numParents * (java.lang.Math.log((e / vm)))) + ((vm - numParents) * (java.lang.Math.log((1.0 - (e / vm)))));
}