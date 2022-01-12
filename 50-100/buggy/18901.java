public java.util.Collection<org.modeldriven.alf.syntax.units.impl.StereotypeAnnotation> getAllAnnotations() {
    org.modeldriven.alf.syntax.units.impl.Member self = this.getSelf();
    java.util.Collection<org.modeldriven.alf.syntax.units.impl.StereotypeAnnotation> annotations = self.getAnnotation();
    org.modeldriven.alf.syntax.units.impl.UnitDefinition subunit = self.getSubunit();
    org.modeldriven.alf.syntax.units.impl.NamespaceDefinition definition = (subunit == null) ? null : subunit.getDefinition();
    if (definition != null) {
        annotations.addAll(definition.getAnnotation());
    }
    return annotations;
}