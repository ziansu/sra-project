@java.lang.Override
public void deserializeSupport() {
    frameContent.deserializeSupport();
    name.deserializeSupport(com.horstmann.violet.product.diagram.sequence.node.IntegrationFrameNode.nameConverter);
    name.setPadding(0, 8, 0, 18);
    type = new com.horstmann.violet.product.diagram.property.choiceList.TextChoiceList<java.lang.String>(com.horstmann.violet.product.diagram.sequence.node.IntegrationFrameNode.TYPE_KEYS, com.horstmann.violet.product.diagram.sequence.node.IntegrationFrameNode.TYPE_KEYS);
    type.setSelectedIndex(selectedType);
    super.deserializeSupport();
    wantedSizeContent.setMinWidth(wantedWeight);
    wantedSizeContent.setMinHeight(wantedHeight);
}