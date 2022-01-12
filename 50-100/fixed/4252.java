public java.lang.String visitMProperty(org.se.lab.metamodel.MProperty property) {
    java.lang.String type = visitMType(property.getType());
    java.lang.String name = property.getName();
    java.lang.StringBuilder code = new java.lang.StringBuilder();
    code.append(name).append(" ").append(type);
    if (property.isId()) {
        code.append(" PRIMARY KEY");
    }
    return code.toString();
}