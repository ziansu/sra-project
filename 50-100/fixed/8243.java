@org.springframework.web.bind.annotation.RequestMapping(value = "/accounts/login", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public gov.nist.hit.core.domain.ResponseMessage doNothing(javax.servlet.http.HttpSession session) {
    org.springframework.security.core.userdetails.User u = userService.getCurrentUser();
    if (u != null) {
        gov.nist.auth.hit.core.domain.Account a = accountService.findByTheAccountsUsername(u.getUsername());
        if (a != null) {
            gov.nist.hit.core.api.SessionContext.setCurrentUserId(session, a.getId());
            recordLastLoggedInDate(a.getId());
        }
    }
    return new gov.nist.hit.core.domain.ResponseMessage(ResponseMessage.Type.success, "loginSuccess", "succes");
}