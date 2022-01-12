private int selectBestValue() {
    double[] table = getCostTableSum((-1));
    table[1] += weight;
    return agent.BinaryCCG.Commons.getArgMin(table);
}