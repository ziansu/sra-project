public static eu.h2020.symbiote.core.model.internal.CoreResource convertResourceToCoreResource(eu.h2020.symbiote.core.model.resources.Resource resource) {
    eu.h2020.symbiote.core.model.internal.CoreResource coreResource = new eu.h2020.symbiote.core.model.internal.CoreResource();
    if ((resource.getId()) != null)
        coreResource.setId(resource.getId());
    
    coreResource.setComments(resource.getComments());
    coreResource.setLabels(resource.getLabels());
    coreResource.setInterworkingServiceURL(resource.getInterworkingServiceURL());
    return coreResource;
}