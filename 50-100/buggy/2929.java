@org.springframework.context.annotation.Bean
@org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
public de.codecentric.boot.admin.services.ApplicationRegistrator registrator() {
    builder.messageConverters(new org.springframework.http.converter.json.MappingJackson2HttpMessageConverter());
    if ((admin.getUsername()) != null) {
        builder.basicAuthorization(admin.getUsername(), admin.getPassword());
    }
    return new de.codecentric.boot.admin.services.ApplicationRegistrator(builder.build(), admin, client);
}