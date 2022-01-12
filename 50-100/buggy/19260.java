protected void testUsage(java.util.List<ca.uhn.hl7v2.validation.ValidationException> exList, java.lang.String encoded, org.openehealth.ipf.gazelle.validation.core.UsageInfo usage) {
    if (usage.required()) {
        org.openehealth.ipf.gazelle.validation.core.util.ProfileAssertions.profileViolatedWhen(((encoded.length()) == 0), exList, org.openehealth.ipf.gazelle.validation.core.REQUIRED_ELEMENT_MISSING, usage.name);
    }else
        if (usage.disallowed()) {
            org.openehealth.ipf.gazelle.validation.core.util.ProfileAssertions.profileViolatedWhen(((encoded.length()) > 0), exList, org.openehealth.ipf.gazelle.validation.core.NOT_SUPPORTED_ELEMENT_PRESENT, usage.name);
        }
    
}