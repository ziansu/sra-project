public java.lang.Double rateMatch(iad.Neuron n) {
    java.lang.Double dist = 0.0;
    for (int i = 0; (i < (this.val.size())) && (1 < (n.weight.length)); i++) {
        final java.lang.Double d = (n.weight[i]) - (this.val.get(i));
        dist += d * d;
    }
    return java.lang.Math.sqrt(dist);
}