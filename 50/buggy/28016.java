@org.springframework.context.annotation.Bean
public org.apache.cxf.feature.LoggingFeature loggingFeature(uk.gov.dwp.migration.mongo.demo.cxf.client.FeatureRegistry featureRegistry) {
    return featureRegistry.add(new org.apache.cxf.feature.LoggingFeature());
}