private java.util.ArrayList<com.example.igiagante.thegarden.core.domain.entity.Attribute> createAttributesSelectedList() {
    java.util.ArrayList<com.example.igiagante.thegarden.core.domain.entity.Attribute> attributes = new java.util.ArrayList<>();
    for (com.example.igiagante.thegarden.creation.plants.presentation.dataHolders.AttributeHolder holder : attributeSelectedAdapter.getAttributeHolders()) {
        if (holder.isSelected()) {
            com.example.igiagante.thegarden.core.domain.entity.Attribute attribute = holder.getModel();
            attributes.add(attribute);
        }
    }
    return attributes;
}