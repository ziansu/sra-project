void addNode(com.mbzshajib.mining.processor.uncertain.model.UNode node, int index) {
    com.mbzshajib.mining.processor.uncertain.model.HeaderTableItem item = findHeaderTableItemById(node.getId());
    item.addNodeItem(node, index);
}