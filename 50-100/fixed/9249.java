@java.lang.Override
public org.openflexo.foundation.ontology.IFlexoOntologyClass getOntologyClass() {
    if ((getAssignedFlexoProperty()) != null) {
        return getAssignedFlexoProperty().getOntologicType();
    }
    if (FlexoOntologyVirtualModelNature.INSTANCE.hasNature(org.openflexo.foundation.ontology.fml.editionaction.AddIndividual.AddIndividualImpl.getOwningVirtualModel())) {
        return org.openflexo.foundation.ontology.nature.FlexoOntologyVirtualModelNature.getOntologyClass(ontologyClassURI, org.openflexo.foundation.ontology.fml.editionaction.AddIndividual.AddIndividualImpl.getOwningVirtualModel());
    }
    return null;
}