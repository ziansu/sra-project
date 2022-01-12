public java.util.ArrayList<java.lang.Integer> getBlockIndexes(int elem) {
    java.util.ArrayList<java.lang.Integer> ret = new java.util.ArrayList<>();
    for (src.Blockchain.BlockChain<T>.Block each : chain) {
        if (each.elem.equals(elem)) {
            ret.add(each.indice);
        }
    }
    return ret;
}