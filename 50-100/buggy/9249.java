@java.lang.Override
public org.openflexo.foundation.ontology.IFlexoOntologyClass getOntologyClass() {
    if (FlexoOntologyVirtualModelNature.INSTANCE.hasNature(org.openflexo.foundation.ontology.fml.editionaction.AddIndividual.AddIndividualImpl.getOwningVirtualModel())) {
        return org.openflexo.foundation.ontology.nature.FlexoOntologyVirtualModelNature.getOntologyClass(ontologyClassURI, org.openflexo.foundation.ontology.fml.editionaction.AddIndividual.AddIndividualImpl.getOwningVirtualModel());
    }else {
        if ((getAssignedFlexoProperty()) != null) {
            org.openflexo.foundation.ontology.IFlexoOntologyClass<?> t = getAssignedFlexoProperty().getOntologicType();
            setOntologyClass(t);
            return t;
        }
    }
    return null;
}