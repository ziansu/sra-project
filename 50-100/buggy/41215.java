private void addStructuralFeature(org.eclipse.emf.ecore.EStructuralFeature feature, eme.model.datatypes.ExtractedField attribute, org.eclipse.emf.ecore.EClass eClass) {
    feature.setName(attribute.getIdentifier());
    feature.setChangeable((!(attribute.isFinal())));
    typeGenerator.addDataType(feature, attribute, new eme.generator.TypeParameterSource(eClass));
    eClass.getEStructuralFeatures().add(feature);
}