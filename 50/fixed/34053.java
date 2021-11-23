@org.springframework.web.bind.annotation.RequestMapping(value = "/tools/metadata", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public org.sagebionetworks.ga4gh.model.RegistryMetadata getRegistryMetadata() {
    org.sagebionetworks.ga4gh.model.RegistryMetadata metadata = new org.sagebionetworks.ga4gh.model.RegistryMetadata("v1", "us", "Synapse Tool Registry");
    return metadata;
}