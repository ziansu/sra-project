public int getSharksCount(int iteration) {
    if (((sharks.size()) - 1) < iteration) {
        throw new java.lang.RuntimeException("Invalid Iteration EmpireGraphicData!");
    }
    return sharks.get(iteration);
}