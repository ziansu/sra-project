private org.hl7.fhir.dstu3.utils.NarrativeGenerator.ResourceWrapper fetchResource(org.hl7.fhir.dstu3.utils.NarrativeGenerator.BaseWrapper subject) {
    if ((resolver) == null)
        return null;
    
    java.lang.String url = subject.getChildByName("reference").value().toString();
    org.hl7.fhir.dstu3.utils.NarrativeGenerator.ResourceWithReference rr = resolver.resolve(url);
    return rr == null ? null : rr.resource;
}