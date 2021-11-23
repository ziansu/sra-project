public void addAttribute(java.lang.String name, java.lang.String value, boolean escapedAttr) {
    de.neuland.jade4j.parser.node.ValueString valueString = new de.neuland.jade4j.parser.node.ValueString(value);
    valueString.setEscape(escapedAttr);
    attributes.add(new de.neuland.jade4j.lexer.token.Attribute(name, valueString, escapedAttr));
}