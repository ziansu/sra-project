org.LexGrid.relations.AssociationQualification createAssociationQualification(org.semanticweb.owlapi.model.OWLRestriction rdfProp, edu.mayo.informatics.lexgrid.convert.Conversions.SupportedMappings lgSupportedMappings_) {
    java.lang.String label = rdfProp.getClassExpressionType().getName();
    if (label.isEmpty()) {
        label = renderer.render(rdfProp);
    }
    org.LexGrid.relations.AssociationQualification lgQual = edu.mayo.informatics.lexgrid.convert.directConversions.owlapi.CreateUtils.createAssociationQualification(label, null, "", lgSupportedMappings_);
    return lgQual;
}