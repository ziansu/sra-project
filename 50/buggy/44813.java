double getItemPrefixValue() {
    double result = 0;
    for (com.mbzshajib.mining.processor.uncertain.model.UNode node : nodeList) {
        node.getNodePrefixValue();
    }
    return result;
}