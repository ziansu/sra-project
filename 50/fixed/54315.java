public final void setAttribute(com.almasb.zeph.combat.Attribute attr, int value) {
    attributes.put(attr, value);
    attributeProperties.get(attr).set(value);
}