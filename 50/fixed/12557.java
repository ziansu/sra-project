protected void addAttribute(com.agiletec.aps.system.common.entity.model.attribute.AttributeInterface attribute) {
    this.getAttributes().add(attribute);
    this.getAttributeMap().put(attribute.getName(), attribute);
}