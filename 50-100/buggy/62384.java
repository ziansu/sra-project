@java.lang.Override
public void validate(java.util.List<org.hl7.fhir.instance.validation.ValidationMessage> errors, org.w3c.dom.Element element, java.lang.String profile) throws java.lang.Exception {
    org.hl7.fhir.instance.model.Profile p = context.getProfiles().get(profile);
    if (p == null)
        throw new java.lang.Exception((("Profile '" + profile) + "' not found"));
    
    validateResource(errors, "", new org.hl7.fhir.instance.validation.InstanceValidator.DOMWrapperElement(element), p, false);
}