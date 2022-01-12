@org.springframework.security.access.prepost.PreAuthorize(value = "permitAll")
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.http.ResponseEntity<ee.rental.app.core.model.UserAccount> registerAccount(@org.springframework.web.bind.annotation.RequestBody
ee.rental.app.core.model.UserAccount userAccount) {
    try {
        java.lang.System.out.println(("WTF" + userAccount));
        ee.rental.app.core.model.UserAccount user = userAccountService.createUserAccount(userAccount);
        return new org.springframework.http.ResponseEntity<ee.rental.app.core.model.UserAccount>(user, org.springframework.http.HttpStatus.CREATED);
    } catch (ee.rental.app.core.service.exception.UserAccountExistsException e) {
        throw new ee.rental.app.rest.exception.ConflictException(e);
    }
}