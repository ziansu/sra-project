double getItemProbabilityValue() {
    double result = 0;
    for (com.mbzshajib.mining.processor.uncertain.model.UNode node : nodeList) {
        result = result + (node.getItemProbabilityValue());
    }
    return result;
}