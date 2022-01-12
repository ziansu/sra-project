public no.havard.javaflow.model.ClassDefinitionBuilder withField(com.github.javaparser.ast.type.Type type, java.lang.String name) {
    this.fields.add(new no.havard.javaflow.model.FieldDefinition(type, name));
    return this;
}