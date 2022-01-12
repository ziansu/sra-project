@org.springframework.context.annotation.Bean
public com.fasterxml.jackson.databind.ObjectMapper objectMapper() {
    com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE);
    objectMapper.addMixInAnnotations(com.pivotallabs.jarvis.projects.domain.JarvisProjectEntity.class, JacksonMixins.JarvisProjectMixin.class);
    objectMapper.addMixInAnnotations(com.pivotallabs.jarvis.projects.domain.JarvisAllocationEntity.class, JacksonMixins.JarvisAllocationMixin.class);
    objectMapper.addMixInAnnotations(com.pivotallabs.jarvis.projects.domain.JarvisPivotEntity.class, JacksonMixins.JarvisEmployeeMixin.class);
    objectMapper.addMixInAnnotations(com.pivotallabs.jarvis.publictransit.divvy.DivvyStationEntity.class, JacksonMixins.JarvisDivvyStationMixin.class);
    return objectMapper;
}