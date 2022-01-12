private static void appendTitleComponent(java.lang.String tag, de.interoberlin.lymbo.model.card.components.TitleComponent component) {
    java.util.Map<java.lang.String, java.lang.String> attributes = new java.util.HashMap<java.lang.String, java.lang.String>();
    attributes.put("value", component.getValue());
    attributes.put("lines", new java.lang.Integer(component.getLines()).toString());
    attributes.put("gravity", component.getGravity().toString());
    de.interoberlin.lymbo.model.persistence.LymboWriter.addTag(tag, attributes);
}