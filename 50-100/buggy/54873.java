public src.Blockchain.ArrayList<java.lang.Integer> getBlockIndexes(int elem) {
    src.Blockchain.ArrayList<java.lang.Integer> ret = new src.Blockchain.ArrayList();
    for (src.Blockchain.BlockChain<T>.Block each : chain) {
        if (each.elem.equals(elem)) {
            ret.add(each.indice);
        }
    }
    return ret;
}