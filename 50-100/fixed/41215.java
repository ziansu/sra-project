private void addStructuralFeature(org.eclipse.emf.ecore.EStructuralFeature feature, eme.model.datatypes.ExtractedField field, org.eclipse.emf.ecore.EClass eClass) {
    feature.setName(field.getIdentifier());
    feature.setChangeable((!(field.isFinal())));
    typeGenerator.addDataType(feature, field, new eme.generator.TypeParameterSource(eClass));
    eClass.getEStructuralFeatures().add(feature);
}