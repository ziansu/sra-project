@com.codahale.metrics.annotation.Timed
@org.whispersystems.textsecuregcm.controllers.PUT
@org.whispersystems.textsecuregcm.controllers.Path(value = "/gcm/")
@org.whispersystems.textsecuregcm.controllers.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public void setGcmRegistrationId(@io.dropwizard.auth.Auth
org.whispersystems.textsecuregcm.controllers.Account account, @javax.validation.Valid
org.whispersystems.textsecuregcm.entities.GcmRegistrationId registrationId) {
    setPushId(account, null, null, null, registrationId.getGcmRegistrationId(), registrationId.isWebSocketChannel());
}