@org.springframework.web.bind.annotation.PostMapping(value = "/{userId}/activation")
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
public java.lang.Object initiateUserActivation(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long userId, @org.springframework.web.bind.annotation.RequestHeader(value = gov.samhsa.c2s.staffuiapi.infrastructure.UmsClient.X_FORWARDED_PROTO)
java.lang.String xForwardedProto, @org.springframework.web.bind.annotation.RequestHeader(value = gov.samhsa.c2s.staffuiapi.infrastructure.UmsClient.X_FORWARDED_HOST)
java.lang.String xForwardedHost, @org.springframework.web.bind.annotation.RequestHeader(value = gov.samhsa.c2s.staffuiapi.infrastructure.UmsClient.X_FORWARDED_PORT)
java.lang.String xForwardedPort) {
    return umsService.initiateUserActivation(userId, xForwardedProto, xForwardedHost, xForwardedPort);
}