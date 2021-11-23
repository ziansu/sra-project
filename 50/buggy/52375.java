public void setAttribute(java.lang.String name, java.lang.String value) {
    com.coderising.dp.builder.TagNode.Attribute attr = findAttribute(name);
    if (attr != null) {
        attr.value = value;
    }
    attributes.add(new com.coderising.dp.builder.TagNode.Attribute(name, value));
}