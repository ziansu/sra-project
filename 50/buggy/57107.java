public void addAttribute(java.lang.String key, java.lang.String value) {
    net.dandielo.core.items.serialize.ItemAttribute attribute = net.dandielo.core.items.serialize.ItemAttribute.init(this, key, value);
    attributes.remove(attribute);
    attributes.add(attribute);
}