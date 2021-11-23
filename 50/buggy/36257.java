double cost_new(dstarlite.State a, double cost) {
    dstarlite.StateInfo aInfo = S.get(a);
    return java.lang.Math.max(aInfo.getCost(), cost);
}