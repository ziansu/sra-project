public static java.lang.String getReferenceId(org.hl7.fhir.instance.model.Reference reference, org.hl7.fhir.instance.model.ResourceType resourceType) {
    org.endeavourhealth.common.fhir.ReferenceComponents referenceComponents = org.endeavourhealth.common.fhir.ReferenceHelper.getReferenceComponents(reference);
    if (referenceComponents == null)
        return null;
    
    if ((resourceType != null) && (!(referenceComponents.getResourceType().equals(resourceType)))) {
        return null;
    }
    return referenceComponents.getId();
}