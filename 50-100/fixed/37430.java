private java.util.Map<java.lang.String, java.util.List<org.synyx.sybil.jenkins.domain.ConfiguredJob>> loadJobs() throws java.io.IOException {
    return objectMapper.readValue(new java.io.File(((configDirectory) + "jenkins.json")), new com.fasterxml.jackson.core.type.TypeReference<java.util.Map<java.lang.String, java.util.List<org.synyx.sybil.jenkins.domain.ConfiguredJob>>>() {    });
}