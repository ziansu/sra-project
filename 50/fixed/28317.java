@org.springframework.web.bind.annotation.RequestMapping(value = "/users/{userId}/activation", method = org.springframework.web.bind.annotation.RequestMethod.POST)
java.lang.Object initiateUserActivation(@org.springframework.web.bind.annotation.PathVariable(value = "userId")
java.lang.Long userId, @org.springframework.web.bind.annotation.RequestParam(value = "lastUpdatedBy")
java.lang.String lastUpdatedBy, @org.springframework.web.bind.annotation.RequestHeader(value = gov.samhsa.c2s.staffuiapi.infrastructure.UmsClient.X_FORWARDED_PROTO)
java.lang.String xForwardedProto, @org.springframework.web.bind.annotation.RequestHeader(value = gov.samhsa.c2s.staffuiapi.infrastructure.UmsClient.X_FORWARDED_HOST)
java.lang.String xForwardedHost, @org.springframework.web.bind.annotation.RequestHeader(value = gov.samhsa.c2s.staffuiapi.infrastructure.UmsClient.X_FORWARDED_PORT)
java.lang.String xForwardedPort);