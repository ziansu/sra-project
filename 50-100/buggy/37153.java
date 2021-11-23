@java.lang.Override
public void deserializeSupport() {
    type = new com.horstmann.violet.product.diagram.property.choiceList.TextChoiceList<java.lang.String>(com.horstmann.violet.product.diagram.sequence.node.IntegrationFrameNode.TYPE_KEYS, com.horstmann.violet.product.diagram.sequence.node.IntegrationFrameNode.TYPE_KEYS);
    type.setSelectedIndex(selectedType);
    frameContent.deserializeSupport();
    name.deserializeSupport(com.horstmann.violet.product.diagram.sequence.node.IntegrationFrameNode.nameConverter);
    name.setPadding(0, 8, 0, 18);
    super.deserializeSupport();
    wantedSizeContent.setMinWidth(wantedWeight);
    wantedSizeContent.setMinHeight(wantedHeight);
}