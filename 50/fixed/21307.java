@org.springframework.context.annotation.Bean
public org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor payloadValidatingInterceptor() {
    final org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor payloadValidatingInterceptor = new org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor();
    final org.springframework.core.io.Resource[] resources = new org.springframework.core.io.Resource[]{ new org.springframework.core.io.ClassPathResource(com.smartsocietyservices.osgp.ws.da.config.DistributionAutomationWebServiceConfig.COMMON_XSD_PATH) };
    payloadValidatingInterceptor.setSchemas(resources);
    return payloadValidatingInterceptor;
}