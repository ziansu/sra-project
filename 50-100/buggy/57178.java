@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
protected void initialize() throws javax.servlet.ServletException {
    ca.uhn.fhir.context.FhirVersionEnum fhirVersion = ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    setFhirContext(new ca.uhn.fhir.context.FhirContext(fhirVersion));
    java.util.List<ca.uhn.fhir.rest.server.IResourceProvider> providers = new java.util.ArrayList<ca.uhn.fhir.rest.server.IResourceProvider>();
    providers.add(new org.hssc.fhir.rest.provider.RestfulPatientResourceProvider());
    setResourceProviders(providers);
    org.hssc.fhir.rest.servlet.ConformanceProvider confProvider = new org.hssc.fhir.rest.servlet.ConformanceProvider(this);
    setServerConformanceProvider(confProvider);
    ca.uhn.fhir.context.FhirContext ctx = getFhirContext();
    ctx.setNarrativeGenerator(new ca.uhn.fhir.narrative.DefaultThymeleafNarrativeGenerator());
    registerInterceptor(new ca.uhn.fhir.rest.server.interceptor.ResponseHighlighterInterceptor());
    setDefaultPrettyPrint(true);
}