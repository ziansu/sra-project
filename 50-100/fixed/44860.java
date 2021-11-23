private static au.org.aekos.api.producer.step.BagAttributeExtractor commentaryNoUnitsExtractor(java.lang.String finalName, java.lang.String referencingPropertyName, java.lang.String targetTypeLocalName, au.org.aekos.api.producer.ExtractionHelper extractionHelper) {
    au.org.aekos.api.producer.step.PropertyPathNoUnitsBagAttributeExtractor result = new au.org.aekos.api.producer.step.PropertyPathNoUnitsBagAttributeExtractor();
    result.setFinalName(finalName);
    result.setHelper(extractionHelper);
    result.setTargetTypeLocalName(targetTypeLocalName);
    result.setValuePropertyPath(referencingPropertyName.toLowerCase(), "category", "name");
    return result;
}