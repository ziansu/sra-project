@org.springframework.security.access.annotation.Secured(value = "ROLE_USER")
@org.springframework.web.bind.annotation.RequestMapping(value = FacadeControllerURLs.SEND_USERMESSAGE, method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String sendUserMessage(@org.springframework.web.bind.annotation.RequestBody
com.adansoft.great21.dataaccess.schemas.GameMessage incomingrequest, @org.springframework.security.web.bind.annotation.AuthenticationPrincipal
org.springframework.security.core.Authentication authentication) {
    com.adansoft.great21.security.RummyUser user = ((com.adansoft.great21.security.RummyUser) (authentication.getPrincipal()));
    incomingrequest.setFrom(user.getNickname());
    return com.adansoft.great21.controller.helpers.RestServiceHelper.sendUserMessage(mapper, restTemplate, incomingrequest);
}