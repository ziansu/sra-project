@java.lang.Override
public org.hl7.fhir.dstu3.metamodel.Element validate(java.util.List<org.hl7.fhir.dstu3.validation.ValidationMessage> errors, org.w3c.dom.Document document, org.hl7.fhir.dstu3.model.StructureDefinition profile) throws java.lang.Exception {
    org.hl7.fhir.dstu3.metamodel.XmlParser parser = new org.hl7.fhir.dstu3.metamodel.XmlParser(context);
    parser.setupValidation(ValidationPolicy.EVERYTHING, errors);
    long t = java.lang.System.nanoTime();
    org.hl7.fhir.dstu3.metamodel.Element e = parser.parse(document);
    loadTime = (java.lang.System.nanoTime()) - t;
    if (e != null) {
        validate(errors, e, profile);
    }
    return e;
}