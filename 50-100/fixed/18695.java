public java.util.Map<java.lang.String, java.lang.String> getAttributesWithNames() {
    java.util.Map<java.lang.String, java.lang.String> attributesWithNames = new java.util.LinkedHashMap<>();
    if (((getAttributes()) != null) && ((getAttributes().size()) > 0)) {
        for (edu.brandeis.cs.nlp.mae.model.Attribute attribute : getAttributes()) {
            attributesWithNames.put(attribute.getName(), attribute.getValue());
        }
    }
    return attributesWithNames;
}