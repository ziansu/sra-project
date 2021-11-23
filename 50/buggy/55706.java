@org.springframework.context.annotation.Bean
public com.alliander.osgp.adapter.ws.smartmetering.infra.ws.SendNotificationServiceClient sendNotificationServiceClient() throws java.security.GeneralSecurityException {
    return new com.alliander.osgp.adapter.ws.smartmetering.infra.ws.SendNotificationServiceClient(this.createWebServiceTemplateFactory(this.notificationSenderMarshaller()), this.notificationMapper());
}