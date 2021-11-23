public java.util.Map<java.lang.String, java.lang.String> getAttributesWithNames() {
    java.util.Map<java.lang.String, java.lang.String> attributesWithNames = new java.util.LinkedHashMap<>();
    for (edu.brandeis.cs.nlp.mae.model.Attribute attribute : getAttributes()) {
        attributesWithNames.put(attribute.getName(), attribute.getValue());
    }
    return attributesWithNames;
}